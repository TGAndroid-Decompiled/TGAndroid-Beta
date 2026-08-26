package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.iv.RichEditor;

public class QRCodeBottomSheet extends BottomSheet {
    public final TextView button2TextView;
    public final TextView buttonTextView;
    public final TextView help;
    public final RLottieImageView iconImage;
    public final int imageSize;
    public final Bitmap qrCode;

    public QRCodeBottomSheet(Context context, String str, String str2, String str3, boolean z) {
        super(context, null, false, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        VoIPFragment.AnonymousClass9 anonymousClass9 = new VoIPFragment.AnonymousClass9(context, 3);
        anonymousClass9.setScaleType(ImageView.ScaleType.FIT_XY);
        anonymousClass9.setOutlineProvider(new RichEditor.AnonymousClass5(11));
        anonymousClass9.setClipToOutline(true);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap bitmap2 = this.qrCode;
        try {
            HashMap map = new HashMap();
            map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            map.put(EncodeHintType.MARGIN, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            Bitmap bitmapEncode = telegramQRCodeWriter.encode(str2, 768, 768, map, bitmap2);
            this.imageSize = telegramQRCodeWriter.getImageSize();
            bitmap = bitmapEncode;
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.qrCode = bitmap;
        anonymousClass9.setImageBitmap(bitmap);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.iconImage = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        rLottieImageView.setBackgroundColor(-1);
        PassportActivity.AnonymousClass11 anonymousClass11 = new PassportActivity.AnonymousClass11(this, context, anonymousClass9);
        anonymousClass11.addView(anonymousClass9, LayoutHelper.createFrame(-1.0f, -1));
        anonymousClass11.addView(rLottieImageView, LayoutHelper.createFrame(60, 60, 17));
        linearLayoutM.addView(anonymousClass11, LayoutHelper.createLinear(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.help = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayoutM.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.buttonTextView = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(14, this, context));
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, 48, 80, 16, 15, 16, 3));
        if (z) {
            TextView textView3 = new TextView(context);
            this.button2TextView = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(15, str2, context));
            linearLayoutM.addView(textView3, LayoutHelper.createLinear(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors$1();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayoutM);
        setCustomView(scrollView);
    }

    public final void setCenterAnimation(int i) {
        RLottieImageView rLottieImageView = this.iconImage;
        rLottieImageView.setAutoRepeat(true);
        rLottieImageView.setAnimation(i, 60, 60, null);
        rLottieImageView.playAnimation();
    }

    public final void updateColors$1() {
        int themedColor = getThemedColor(Theme.key_featuredStickers_buttonText);
        TextView textView = this.buttonTextView;
        textView.setTextColor(themedColor);
        int iDp = AndroidUtilities.dp(24.0f);
        int i = Theme.key_featuredStickers_addButton;
        int themedColor2 = getThemedColor(i);
        int themedColor3 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.button2TextView;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i));
            textView2.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i), Math.min(255, Color.alpha(getThemedColor(Theme.key_listSelector)) * 2)), 7, -1));
        }
        int i2 = Theme.key_windowBackgroundWhiteGrayText;
        int themedColor4 = getThemedColor(i2);
        TextView textView3 = this.help;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i2));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        }
        setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
    }
}
