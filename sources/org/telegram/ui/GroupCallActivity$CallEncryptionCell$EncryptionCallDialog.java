package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stars.StarReactionsOverlay;

public final class GroupCallActivity$CallEncryptionCell$EncryptionCallDialog extends Dialog {
    public Bitmap blurBitmap;
    public Paint blurBitmapPaint;
    public BitmapShader blurBitmapShader;
    public final Matrix blurMatrix;
    public final QrActivity.AnonymousClass2 cell;
    public boolean dismissing;
    public float progress;
    public ValueAnimator progressAnimator;
    public final CalendarActivity.AnonymousClass5 windowView;

    public GroupCallActivity$CallEncryptionCell$EncryptionCallDialog(Activity activity, QrActivity.AnonymousClass2 anonymousClass2) {
        super(activity, R.style.TransparentDialog);
        this.blurMatrix = new Matrix();
        this.cell = anonymousClass2;
        anonymousClass2.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new OAuthSheet$$ExternalSyntheticLambda13(13, this, anonymousClass2), 14.0f);
        CalendarActivity.AnonymousClass5 anonymousClass5 = new CalendarActivity.AnonymousClass5(this, activity, anonymousClass2);
        this.windowView = anonymousClass5;
        anonymousClass5.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 29));
    }

    public final void animate(float f, GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2 groupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2) {
        int i = 1;
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.progressAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progress, f);
        this.progressAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 16));
        this.progressAnimator.addListener(new StarReactionsOverlay.AnonymousClass1(this, f, groupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2, i));
        this.progressAnimator.setDuration(420L);
        this.progressAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.progressAnimator.start();
    }

    @Override
    public final void dismiss() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        animate(0.0f, new GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void lambda$dismiss$3() {
        super.dismiss();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        animate(1.0f, null);
        AndroidUtilities.runOnUIThread(new GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2(this, 1), 16L);
    }
}
