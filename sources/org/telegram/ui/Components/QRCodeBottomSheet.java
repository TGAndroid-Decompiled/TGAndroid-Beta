package org.telegram.ui.Components;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public class QRCodeBottomSheet extends BottomSheet {
    private final TextView buttonTextView;
    private final TextView help;
    RLottieImageView iconImage;
    int imageSize;
    Bitmap qrCode;

    public QRCodeBottomSheet(final Context context, String str, String str2) {
        super(context, false);
        setTitle(LocaleController.getString("InviteByQRCode", R.string.InviteByQRCode), true);
        final ImageView imageView = new ImageView(this, context) {
            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }
        };
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(12.0f));
                }
            });
            imageView.setClipToOutline(true);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap createQR = createQR(context, str, this.qrCode);
        this.qrCode = createQR;
        imageView.setImageBitmap(createQR);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.iconImage = rLottieImageView;
        rLottieImageView.setBackgroundColor(-1);
        this.iconImage.setAutoRepeat(true);
        this.iconImage.setAnimation(R.raw.qr_code_logo, 60, 60);
        this.iconImage.playAnimation();
        FrameLayout frameLayout = new FrameLayout(context) {
            float lastX;

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                float measuredHeight = (QRCodeBottomSheet.this.imageSize / 768.0f) * imageView.getMeasuredHeight();
                if (this.lastX != measuredHeight) {
                    this.lastX = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = QRCodeBottomSheet.this.iconImage.getLayoutParams();
                    int i3 = (int) measuredHeight;
                    QRCodeBottomSheet.this.iconImage.getLayoutParams().width = i3;
                    layoutParams.height = i3;
                    super.onMeasure(i, i2);
                }
            }
        };
        frameLayout.addView(imageView, LayoutHelper.createFrame(-1, -1.0f));
        frameLayout.addView(this.iconImage, LayoutHelper.createFrame(60, 60, 17));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.help = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str2);
        textView.setGravity(1);
        linearLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.buttonTextView = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView2.setText(LocaleController.getString("ShareQrCode", R.string.ShareQrCode));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                QRCodeBottomSheet.this.lambda$new$0(context, view);
            }
        });
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 80, 16, 15, 16, 16));
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public void lambda$new$0(Context context, View view) {
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(this.qrCode, "qr_tmp.png", Bitmap.CompressFormat.PNG);
        if (bitmapShareUri != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
            try {
                AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, LocaleController.getString("InviteByQRCode", R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public Bitmap createQR(Context context, String str, Bitmap bitmap) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            hashMap.put(EncodeHintType.MARGIN, 0);
            QRCodeWriter qRCodeWriter = new QRCodeWriter();
            Bitmap encode = qRCodeWriter.encode(str, 768, 768, hashMap, bitmap);
            this.imageSize = qRCodeWriter.getImageSize();
            return encode;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public void updateColors() {
        this.buttonTextView.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor("featuredStickers_addButton"), Theme.getColor("featuredStickers_addButtonPressed")));
        this.help.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        this.buttonTextView.setTextColor(Theme.getColor("featuredStickers_buttonText"));
        if (getTitleView() != null) {
            getTitleView().setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        }
        setBackgroundColor(Theme.getColor("dialogBackground"));
    }
}
