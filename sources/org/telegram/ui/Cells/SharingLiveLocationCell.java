package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzlh;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.LocationActivity;

public final class SharingLiveLocationCell extends FrameLayout {
    public AvatarDrawable avatarDrawable;
    public final BackupImageView avatarImageView;
    public int currentAccount;
    public LocationController.SharingLocationInfo currentInfo;
    public final TextView distanceTextView;
    public int distanceTextViewHeight;
    public boolean distanceTextViewSingle;
    public Drawable foreverDrawable;
    public int foreverDrawableColor;
    public final BubbleActivity.AnonymousClass1 invalidateRunnable;
    public double lastLat;
    public double lastLong;
    public CharSequence lastName;
    public LocationActivity.LiveLocation liveLocation;
    public boolean loading;
    public SpannableString loadingString;
    public final Location location;
    public final SimpleTextView nameTextView;
    public final int padding;
    public final RectF rect;
    public final Theme.ResourcesProvider resourcesProvider;

    public SharingLiveLocationCell(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.rect = new RectF();
        this.location = new Location("network");
        this.currentAccount = UserConfig.selectedAccount;
        this.invalidateRunnable = new BubbleActivity.AnonymousClass1(this, 8);
        this.lastName = "";
        this.resourcesProvider = resourcesProvider;
        this.padding = i;
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        NotificationCenter.listenEmojiLoading(simpleTextView);
        simpleTextView.setTextSize(16);
        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView.setScrollNonFitText(true);
        if (z) {
            boolean z2 = LocaleController.isRTL;
            addView(backupImageView, LayoutHelper.createFrame(42, 42.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 15.0f, 12.0f, z2 ? 15.0f : 0.0f, 0.0f));
            boolean z3 = LocaleController.isRTL;
            addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? i : 73.0f, 12.0f, z3 ? 73.0f : 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.distanceTextView = textView;
            textView.setSingleLine();
            this.distanceTextViewSingle = true;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z4 = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? i : 73.0f, 33.0f, z4 ? 73.0f : i, 0.0f));
        } else {
            boolean z5 = LocaleController.isRTL;
            addView(backupImageView, LayoutHelper.createFrame(42, 42.0f, (z5 ? 5 : 3) | 48, z5 ? 0.0f : 15.0f, 6.0f, z5 ? 15.0f : 0.0f, 0.0f));
            boolean z6 = LocaleController.isRTL;
            addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, (z6 ? 5 : 3) | 48, z6 ? i : 74.0f, 17.0f, z6 ? 74.0f : i, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence getName(double d, double d2) {
        SharingLiveLocationCell sharingLiveLocationCell;
        if (this.loading) {
            return this.lastName;
        }
        if (Math.abs(this.lastLat - d) > 1.0E-6d || Math.abs(this.lastLong - d2) > 1.0E-6d || TextUtils.isEmpty(this.lastName)) {
            this.loading = true;
            sharingLiveLocationCell = this;
            Utilities.globalQueue.postRunnable(new SharingLiveLocationCell$$ExternalSyntheticLambda0(sharingLiveLocationCell, d, d2, 0));
        } else {
            sharingLiveLocationCell = this;
        }
        return sharingLiveLocationCell.lastName;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.invalidateRunnable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.invalidateRunnable);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        LocationController.SharingLocationInfo sharingLocationInfo = this.currentInfo;
        if (sharingLocationInfo == null && this.liveLocation == null) {
            return;
        }
        if (sharingLocationInfo != null) {
            i2 = sharingLocationInfo.stopTime;
            i = sharingLocationInfo.period;
        } else {
            TLRPC.Message message = this.liveLocation.object;
            int i3 = message.date;
            i = message.media.period;
            i2 = i3 + i;
        }
        boolean z = i == Integer.MAX_VALUE;
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if (i2 >= currentTime || z) {
            float fAbs = z ? 1.0f : Math.abs(i2 - currentTime) / i;
            boolean z2 = LocaleController.isRTL;
            TextView textView = this.distanceTextView;
            RectF rectF = this.rect;
            if (z2) {
                rectF.set(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView != null ? 48.0f : 42.0f));
            } else {
                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), AndroidUtilities.dp(textView != null ? 18.0f : 12.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), AndroidUtilities.dp(textView != null ? 48.0f : 42.0f));
            }
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int color = textView == null ? Theme.getColor(Theme.key_dialog_liveLocationProgress, resourcesProvider) : Theme.getColor(Theme.key_location_liveLocationProgress, resourcesProvider);
            Theme.chat_radialProgress2Paint.setColor(color);
            Theme.chat_livePaint.setColor(color);
            int alpha = Theme.chat_radialProgress2Paint.getAlpha();
            Theme.chat_radialProgress2Paint.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, Theme.chat_radialProgress2Paint);
            Theme.chat_radialProgress2Paint.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, fAbs * (-360.0f), false, Theme.chat_radialProgress2Paint);
            Theme.chat_radialProgress2Paint.setAlpha(alpha);
            if (!z) {
                String locationLeftTime = LocaleController.formatLocationLeftTime(i2 - currentTime);
                canvas.drawText(locationLeftTime, rectF.centerX() - (Theme.chat_livePaint.measureText(locationLeftTime) / 2.0f), AndroidUtilities.dp(textView != null ? 37.0f : 31.0f), Theme.chat_livePaint);
                return;
            }
            if (this.foreverDrawable == null) {
                this.foreverDrawable = getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
            }
            if (Theme.chat_livePaint.getColor() != this.foreverDrawableColor) {
                Drawable drawable = this.foreverDrawable;
                int color2 = Theme.chat_livePaint.getColor();
                this.foreverDrawableColor = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            this.foreverDrawable.setBounds(zzle.m((int) rectF.centerX(), this.foreverDrawable), zzld.m((int) rectF.centerY(), this.foreverDrawable), zzlh.m((int) rectF.centerX(), this.foreverDrawable), zzlg.m((int) rectF.centerY(), this.foreverDrawable));
            this.foreverDrawable.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        TextView textView = this.distanceTextView;
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(textView != null ? 66.0f : 54.0f) + ((textView == null || this.distanceTextViewSingle) ? 0 : (-AndroidUtilities.dp(20.0f)) + this.distanceTextViewHeight), 1073741824));
    }

    public final void setDialog(MessageObject messageObject, Location location, boolean z) {
        float f;
        CharSequence name;
        TLRPC.Message message;
        SimpleTextView simpleTextView = this.nameTextView;
        BackupImageView backupImageView = this.avatarImageView;
        TextView textView = this.distanceTextView;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(R.drawable.pin);
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_location_sendLocationIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            int color = Theme.getColor(Theme.key_location_placeLocationBackground, resourcesProvider);
            CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(42.0f), color, color), drawable);
            int iDp = AndroidUtilities.dp(42.0f);
            int iDp2 = AndroidUtilities.dp(42.0f);
            combinedDrawable.backWidth = iDp;
            combinedDrawable.backHeight = iDp2;
            int iDp3 = AndroidUtilities.dp(24.0f);
            int iDp4 = AndroidUtilities.dp(24.0f);
            combinedDrawable.iconWidth = iDp3;
            combinedDrawable.iconHeight = iDp4;
            backupImageView.setImageDrawable(combinedDrawable);
            simpleTextView.setText(Emoji.replaceEmoji(MessagesController.getInstance(this.currentAccount).getPeerName(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id)), simpleTextView.getPaint().getFontMetricsInt(), false), false);
            this.distanceTextViewSingle = false;
            textView.setSingleLine(false);
            String str = messageObject.messageOwner.media.address;
            this.distanceTextViewHeight = new StaticLayout(str, textView.getPaint(), AndroidUtilities.displaySize.x - AndroidUtilities.dp(this.padding + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str);
            requestLayout();
            return;
        }
        this.distanceTextViewSingle = true;
        textView.setSingleLine(true);
        long fromChatId = messageObject.getFromChatId();
        if (messageObject.isForwarded()) {
            fromChatId = MessageObject.getPeerId(messageObject.messageOwner.fwd_from.from_id);
        }
        this.currentAccount = messageObject.currentAccount;
        String str2 = !TextUtils.isEmpty(messageObject.messageOwner.media.address) ? messageObject.messageOwner.media.address : null;
        boolean zIsEmpty = TextUtils.isEmpty(messageObject.messageOwner.media.title);
        if (zIsEmpty) {
            this.avatarDrawable = null;
            if (fromChatId > 0) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    this.avatarDrawable = new AvatarDrawable(user);
                    name = UserObject.getUserName(user);
                    f = 24.0f;
                    backupImageView.imageReceiver.setForUserOrChat(user, this.avatarDrawable);
                    backupImageView.onNewImageSet();
                } else {
                    f = 24.0f;
                    TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                    name = getName(geoPoint.lat, geoPoint._long);
                    zIsEmpty = false;
                }
            } else {
                f = 24.0f;
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    AvatarDrawable avatarDrawable = new AvatarDrawable(chat);
                    this.avatarDrawable = avatarDrawable;
                    name = chat.title;
                    backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                    backupImageView.onNewImageSet();
                } else {
                    TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                    name = getName(geoPoint2.lat, geoPoint2._long);
                    zIsEmpty = false;
                }
            }
        } else {
            f = 24.0f;
            name = "";
        }
        if (TextUtils.isEmpty(name)) {
            if (this.loadingString == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.loadingString = spannableString;
                spannableString.setSpan(new LoadingSpan(AndroidUtilities.dp(100.0f), 0, simpleTextView, resourcesProvider), 0, this.loadingString.length(), 33);
            }
            name = this.loadingString;
        }
        if (!zIsEmpty) {
            if (!TextUtils.isEmpty(messageObject.messageOwner.media.title)) {
                name = messageObject.messageOwner.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.pin);
            drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_location_sendLocationIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            int color2 = Theme.getColor(Theme.key_location_placeLocationBackground, resourcesProvider);
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(42.0f), color2, color2), drawable2);
            int iDp5 = AndroidUtilities.dp(42.0f);
            int iDp6 = AndroidUtilities.dp(42.0f);
            combinedDrawable2.backWidth = iDp5;
            combinedDrawable2.backHeight = iDp6;
            int iDp7 = AndroidUtilities.dp(f);
            int iDp8 = AndroidUtilities.dp(f);
            combinedDrawable2.iconWidth = iDp7;
            combinedDrawable2.iconHeight = iDp8;
            backupImageView.setImageDrawable(combinedDrawable2);
        }
        simpleTextView.setText(name, false);
        Location location2 = this.location;
        location2.setLatitude(messageObject.messageOwner.media.geo.lat);
        location2.setLongitude(messageObject.messageOwner.media.geo._long);
        if (location == null) {
            if (str2 != null) {
                textView.setText(str2);
                return;
            } else if (z) {
                textView.setText("");
                return;
            } else {
                textView.setText(LocaleController.getString(R.string.Loading));
                return;
            }
        }
        float fDistanceTo = location2.distanceTo(location);
        if (str2 == null) {
            textView.setText(LocaleController.formatDistance(fDistanceTo, 0));
            return;
        }
        textView.setText(str2 + " - " + LocaleController.formatDistance(fDistanceTo, 0));
    }

    public void setDialog(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.currentInfo = sharingLocationInfo;
        this.currentAccount = sharingLocationInfo.account;
        BackupImageView backupImageView = this.avatarImageView;
        backupImageView.getImageReceiver().setCurrentAccount(this.currentAccount);
        boolean zIsUserDialog = DialogObject.isUserDialog(sharingLocationInfo.did);
        SimpleTextView simpleTextView = this.nameTextView;
        if (zIsUserDialog) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(sharingLocationInfo.did));
            if (user != null) {
                this.avatarDrawable.setInfo(this.currentAccount, user);
                simpleTextView.setText(ContactsController.formatName(user.first_name, user.last_name), false);
                backupImageView.imageReceiver.setForUserOrChat(user, this.avatarDrawable);
                backupImageView.onNewImageSet();
                return;
            }
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-sharingLocationInfo.did));
        if (chat != null) {
            this.avatarDrawable.setInfo(this.currentAccount, chat);
            simpleTextView.setText(chat.title, false);
            backupImageView.imageReceiver.setForUserOrChat(chat, this.avatarDrawable);
            backupImageView.onNewImageSet();
        }
    }
}
