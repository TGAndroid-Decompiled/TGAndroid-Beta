package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.ShareLocationDrawable;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Message;

public class SendLocationCell extends FrameLayout {
    private SimpleTextView accurateTextView;
    private int currentAccount;
    private long dialogId;
    private ImageView imageView;
    private Runnable invalidateRunnable;
    private boolean live;
    private RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private SimpleTextView titleTextView;

    public SendLocationCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.invalidateRunnable = new Runnable() {
            @Override
            public void run() {
                SendLocationCell.this.checkText();
                SendLocationCell sendLocationCell = SendLocationCell.this;
                sendLocationCell.invalidate(((int) sendLocationCell.rect.left) - 5, ((int) SendLocationCell.this.rect.top) - 5, ((int) SendLocationCell.this.rect.right) + 5, ((int) SendLocationCell.this.rect.bottom) + 5);
                AndroidUtilities.runOnUIThread(SendLocationCell.this.invalidateRunnable, 1000L);
            }
        };
        this.resourcesProvider = resourcesProvider;
        this.live = z;
        this.imageView = new ImageView(context);
        setBackground(Theme.AdaptiveRipple.rect());
        this.imageView.setTag(z ? "location_sendLiveLocationBackgroundlocation_sendLiveLocationIcon" : "location_sendLocationBackgroundlocation_sendLocationIcon");
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m35dp(42.0f), getThemedColor(z ? "location_sendLiveLocationBackground" : "location_sendLocationBackground"), getThemedColor(z ? "location_sendLiveLocationBackground" : "location_sendLocationBackground"));
        if (z) {
            this.rect = new RectF();
            ShareLocationDrawable shareLocationDrawable = new ShareLocationDrawable(context, 4);
            shareLocationDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor("location_sendLiveLocationIcon"), PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(createSimpleSelectorCircleDrawable, shareLocationDrawable);
            combinedDrawable.setCustomSize(AndroidUtilities.m35dp(42.0f), AndroidUtilities.m35dp(42.0f));
            this.imageView.setBackgroundDrawable(combinedDrawable);
            AndroidUtilities.runOnUIThread(this.invalidateRunnable, 1000L);
            setWillNotDraw(false);
        } else {
            Drawable drawable = getResources().getDrawable(C1010R.C1011drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(getThemedColor("location_sendLocationIcon"), PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(createSimpleSelectorCircleDrawable, drawable);
            combinedDrawable2.setCustomSize(AndroidUtilities.m35dp(42.0f), AndroidUtilities.m35dp(42.0f));
            combinedDrawable2.setIconSize(AndroidUtilities.m35dp(24.0f), AndroidUtilities.m35dp(24.0f));
            this.imageView.setBackgroundDrawable(combinedDrawable2);
        }
        ImageView imageView = this.imageView;
        boolean z2 = LocaleController.isRTL;
        addView(imageView, LayoutHelper.createFrame(42, 42.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 15.0f, 12.0f, z2 ? 15.0f : 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.titleTextView = simpleTextView;
        simpleTextView.setTextSize(16);
        this.titleTextView.setTag(z ? "location_sendLiveLocationText" : "location_sendLocationText");
        this.titleTextView.setTextColor(getThemedColor(z ? "location_sendLiveLocationText" : "location_sendLocationText"));
        this.titleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        SimpleTextView simpleTextView2 = this.titleTextView;
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 16.0f : 73.0f, 12.0f, z3 ? 73.0f : 16.0f, 0.0f));
        SimpleTextView simpleTextView3 = new SimpleTextView(context);
        this.accurateTextView = simpleTextView3;
        simpleTextView3.setTextSize(14);
        this.accurateTextView.setTextColor(getThemedColor("windowBackgroundWhiteGrayText3"));
        this.accurateTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        SimpleTextView simpleTextView4 = this.accurateTextView;
        boolean z4 = LocaleController.isRTL;
        addView(simpleTextView4, LayoutHelper.createFrame(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 16.0f : 73.0f, 37.0f, z4 ? 73.0f : 16.0f, 0.0f));
    }

    private ImageView getImageView() {
        return this.imageView;
    }

    public void setHasLocation(boolean z) {
        if (LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId) == null) {
            this.titleTextView.setAlpha(z ? 1.0f : 0.5f);
            this.accurateTextView.setAlpha(z ? 1.0f : 0.5f);
            this.imageView.setAlpha(z ? 1.0f : 0.5f);
        }
        if (this.live) {
            checkText();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(66.0f), 1073741824));
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.invalidateRunnable);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.rect != null) {
            AndroidUtilities.runOnUIThread(this.invalidateRunnable, 1000L);
        }
    }

    public void setText(String str, String str2) {
        this.titleTextView.setText(str);
        this.accurateTextView.setText(str2);
    }

    public void setDialogId(long j) {
        this.dialogId = j;
        if (this.live) {
            checkText();
        }
    }

    public void checkText() {
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId);
        if (sharingLocationInfo != null) {
            String string = LocaleController.getString("StopLiveLocation", C1010R.string.StopLiveLocation);
            TLRPC$Message tLRPC$Message = sharingLocationInfo.messageObject.messageOwner;
            int i = tLRPC$Message.edit_date;
            setText(string, LocaleController.formatLocationUpdateDate(i != 0 ? i : tLRPC$Message.date));
            return;
        }
        setText(LocaleController.getString("SendLiveLocation", C1010R.string.SendLiveLocation), LocaleController.getString("SendLiveLocationInfo", C1010R.string.SendLiveLocationInfo));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int currentTime;
        int i;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId);
        if (sharingLocationInfo != null && (i = sharingLocationInfo.stopTime) >= (currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime())) {
            float abs = Math.abs(i - currentTime) / sharingLocationInfo.period;
            if (LocaleController.isRTL) {
                this.rect.set(AndroidUtilities.m35dp(13.0f), AndroidUtilities.m35dp(18.0f), AndroidUtilities.m35dp(43.0f), AndroidUtilities.m35dp(48.0f));
            } else {
                this.rect.set(getMeasuredWidth() - AndroidUtilities.m35dp(43.0f), AndroidUtilities.m35dp(18.0f), getMeasuredWidth() - AndroidUtilities.m35dp(13.0f), AndroidUtilities.m35dp(48.0f));
            }
            int themedColor = getThemedColor("location_liveLocationProgress");
            Theme.chat_radialProgress2Paint.setColor(themedColor);
            Theme.chat_livePaint.setColor(themedColor);
            canvas.drawArc(this.rect, -90.0f, abs * (-360.0f), false, Theme.chat_radialProgress2Paint);
            String formatLocationLeftTime = LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime));
            canvas.drawText(formatLocationLeftTime, this.rect.centerX() - (Theme.chat_livePaint.measureText(formatLocationLeftTime) / 2.0f), AndroidUtilities.m35dp(37.0f), Theme.chat_livePaint);
        }
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
