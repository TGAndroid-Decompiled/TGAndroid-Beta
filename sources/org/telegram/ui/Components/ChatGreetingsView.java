package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
public class ChatGreetingsView extends LinearLayout {
    private final int currentAccount;
    private TextView descriptionView;
    boolean ignoreLayot;
    private Listener listener;
    private TLRPC$Document preloadedGreetingsSticker;
    private final Theme.ResourcesProvider resourcesProvider;
    public BackupImageView stickerToSendView;
    private TextView titleView;
    boolean wasDraw;

    public interface Listener {
        void onGreetings(TLRPC$Document tLRPC$Document);
    }

    public ChatGreetingsView(Context context, TLRPC$User tLRPC$User, int i, int i2, TLRPC$Document tLRPC$Document, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        setOrientation(1);
        this.currentAccount = i2;
        this.resourcesProvider = resourcesProvider;
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 14.0f);
        this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleView.setGravity(1);
        TextView textView2 = new TextView(context);
        this.descriptionView = textView2;
        textView2.setTextSize(1, 14.0f);
        this.descriptionView.setGravity(1);
        this.stickerToSendView = new BackupImageView(context);
        addView(this.titleView, LayoutHelper.createLinear(-1, -2, 20.0f, 14.0f, 20.0f, 14.0f));
        addView(this.descriptionView, LayoutHelper.createLinear(-1, -2, 20.0f, 12.0f, 20.0f, 0.0f));
        addView(this.stickerToSendView, LayoutHelper.createLinear(112, 112, 1, 0, 16, 0, 16));
        updateColors();
        if (i <= 0) {
            this.titleView.setText(LocaleController.getString("NoMessages", R.string.NoMessages));
            this.descriptionView.setText(LocaleController.getString("NoMessagesGreetingsDescription", R.string.NoMessagesGreetingsDescription));
        } else {
            this.titleView.setText(LocaleController.formatString("NearbyPeopleGreetingsMessage", R.string.NearbyPeopleGreetingsMessage, tLRPC$User.first_name, LocaleController.formatDistance(i, 1)));
            this.descriptionView.setText(LocaleController.getString("NearbyPeopleGreetingsDescription", R.string.NearbyPeopleGreetingsDescription));
        }
        this.stickerToSendView.setContentDescription(this.descriptionView.getText());
        this.preloadedGreetingsSticker = tLRPC$Document;
        if (tLRPC$Document == null) {
            this.preloadedGreetingsSticker = MediaDataController.getInstance(i2).getGreetingsSticker();
        }
    }

    private void setSticker(final TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return;
        }
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document, "chat_serviceBackground", 1.0f);
        if (svgThumb != null) {
            this.stickerToSendView.setImage(ImageLocation.getForDocument(tLRPC$Document), createFilter(tLRPC$Document), svgThumb, 0, tLRPC$Document);
        } else {
            this.stickerToSendView.setImage(ImageLocation.getForDocument(tLRPC$Document), createFilter(tLRPC$Document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90), tLRPC$Document), (String) null, 0, tLRPC$Document);
        }
        this.stickerToSendView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatGreetingsView.this.lambda$setSticker$0(tLRPC$Document, view);
            }
        });
    }

    public void lambda$setSticker$0(TLRPC$Document tLRPC$Document, View view) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onGreetings(tLRPC$Document);
        }
    }

    public static String createFilter(TLRPC$Document tLRPC$Document) {
        float min;
        float f;
        int i;
        int i2;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f = 0.4f;
        } else {
            android.graphics.Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        float f2 = min * f;
        int i3 = 0;
        while (true) {
            if (i3 >= tLRPC$Document.attributes.size()) {
                i = 0;
                i2 = 0;
                break;
            }
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i3);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) {
                i = tLRPC$DocumentAttribute.w;
                i2 = tLRPC$DocumentAttribute.h;
                break;
            }
            i3++;
        }
        if (MessageObject.isAnimatedStickerDocument(tLRPC$Document, true) && i == 0 && i2 == 0) {
            i = LiteMode.FLAG_CALLS_ANIMATIONS;
            i2 = LiteMode.FLAG_CALLS_ANIMATIONS;
        }
        if (i == 0) {
            i2 = (int) f2;
            i = i2 + AndroidUtilities.dp(100.0f);
        }
        int i4 = (int) (i2 * (f2 / i));
        int i5 = (int) f2;
        float f3 = i4;
        if (f3 > f2) {
            i5 = (int) (i5 * (f2 / f3));
            i4 = i5;
        }
        float f4 = i5;
        float f5 = AndroidUtilities.density;
        return String.format(Locale.US, "%d_%d", Integer.valueOf((int) (f4 / f5)), Integer.valueOf((int) (i4 / f5)));
    }

    private void updateColors() {
        this.titleView.setTextColor(getThemedColor("chat_serviceText"));
        this.descriptionView.setTextColor(getThemedColor("chat_serviceText"));
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.ignoreLayot = true;
        this.descriptionView.setVisibility(0);
        this.stickerToSendView.setVisibility(0);
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i2)) {
            this.descriptionView.setVisibility(8);
            this.stickerToSendView.setVisibility(8);
        } else {
            this.descriptionView.setVisibility(0);
            this.stickerToSendView.setVisibility(0);
        }
        this.ignoreLayot = false;
        super.onMeasure(i, i2);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (!this.wasDraw) {
            this.wasDraw = true;
            setSticker(this.preloadedGreetingsSticker);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayot) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fetchSticker();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void fetchSticker() {
        if (this.preloadedGreetingsSticker == null) {
            TLRPC$Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.preloadedGreetingsSticker = greetingsSticker;
            if (this.wasDraw) {
                setSticker(greetingsSticker);
            }
        }
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
