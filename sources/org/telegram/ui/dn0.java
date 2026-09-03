package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.UserConfig;
public final class dn0 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final TextView f33503a;
    public final TextView f33504b;
    public final org.telegram.ui.Components.p9 f33505c;
    public final org.telegram.ui.Components.kj0 d;
    public int e;
    public SecureDocument f33506f;
    public final int h;
    public final fn0 f33507n;

    public dn0(fn0 fn0Var, Activity activity) {
        super(activity);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f33507n = fn0Var;
        i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        this.h = DownloadController.getInstance(i10).generateObserverTag();
        this.d = new org.telegram.ui.Components.kj0(this);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
        this.f33505c = p9Var;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(p9Var, k7.b6.d(48, 48.0f, i11 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f33503a = textView;
        b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i18 = i13 | 48;
        if (z4) {
            i14 = 21;
        } else {
            i14 = 81;
        }
        float f10 = i14;
        if (z4) {
            i15 = 81;
        } else {
            i15 = 21;
        }
        addView(textView, k7.b6.d(-2, -2.0f, i18, f10, 10.0f, i15, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f33504b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20273z6, false));
        textView2.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView2.setGravity(i16);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z10 = LocaleController.isRTL;
        int i19 = (z10 ? 5 : 3) | 48;
        if (z10) {
            i17 = 21;
        } else {
            i17 = 81;
        }
        addView(textView2, k7.b6.d(-2, -2.0f, i19, i17, 35.0f, z10 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        String attachFileName = FileLoader.getAttachFileName(this.f33506f);
        boolean exists = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.f33506f).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (isEmpty) {
            kj0Var.d(null, false, false);
            return;
        }
        SecureDocument secureDocument = this.f33506f;
        String str = secureDocument.path;
        float f10 = 0.0f;
        fn0 fn0Var = this.f33507n;
        if (str != null) {
            if (secureDocument.inputFile != null) {
                i13 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                DownloadController.getInstance(i13).removeLoadingFileObserver(this);
                kj0Var.d(null, false, z4);
                this.e = -1;
                return;
            }
            i12 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
            DownloadController.getInstance(i12).addLoadingFileObserver(this.f33506f.path, this);
            this.e = 1;
            Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f33506f.path);
            kj0Var.d(getResources().getDrawable(R.drawable.circle), true, z4);
            if (fileProgress != null) {
                f10 = fileProgress.floatValue();
            }
            kj0Var.e(f10, false);
            invalidate();
        } else if (exists) {
            i11 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            this.e = -1;
            kj0Var.d(null, false, z4);
            invalidate();
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this);
            this.e = 1;
            Float fileProgress2 = ImageLoader.getInstance().getFileProgress(attachFileName);
            kj0Var.d(getResources().getDrawable(R.drawable.circle), true, z4);
            if (fileProgress2 != null) {
                f10 = fileProgress2.floatValue();
            }
            kj0Var.e(f10, z4);
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.f33505c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override
    public int getObserverTag() {
        return this.h;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f33503a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (LocaleController.isRTL) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        a(false);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        org.telegram.ui.Components.p9 p9Var = this.f33505c;
        int measuredWidth = ((p9Var.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) / 2) + p9Var.getLeft();
        int measuredHeight = ((p9Var.getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2) + p9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), b.B(64.0f, 1, 1073741824));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.d.e(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.e != 1) {
            a(false);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
        this.d.e(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.d.e(1.0f, true);
        a(true);
    }

    public void setValue(CharSequence charSequence) {
        this.f33504b.setText(charSequence);
    }
}
