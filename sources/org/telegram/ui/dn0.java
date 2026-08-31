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
    public final TextView f36264a;
    public final TextView f36265b;
    public final org.telegram.ui.Components.p9 f36266c;
    public final org.telegram.ui.Components.mj0 d;
    public int f36267e;
    public SecureDocument f36268f;
    public final int h;
    public final fn0 f36269n;

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
        this.f36269n = fn0Var;
        i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        this.h = DownloadController.getInstance(i10).generateObserverTag();
        this.d = new org.telegram.ui.Components.mj0(this);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
        this.f36266c = p9Var;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(p9Var, k7.c6.d(48, 48.0f, i11 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f36264a = textView;
        b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f, 1);
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
        addView(textView, k7.c6.d(-2, -2.0f, i18, f10, 10.0f, i15, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f36265b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22053z6, false));
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
        addView(textView2, k7.c6.d(-2, -2.0f, i19, i17, 35.0f, z10 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        String attachFileName = FileLoader.getAttachFileName(this.f36268f);
        boolean exists = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.f36268f).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (isEmpty) {
            mj0Var.d(null, false, false);
            return;
        }
        SecureDocument secureDocument = this.f36268f;
        String str = secureDocument.path;
        float f10 = 0.0f;
        fn0 fn0Var = this.f36269n;
        if (str != null) {
            if (secureDocument.inputFile != null) {
                i13 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                DownloadController.getInstance(i13).removeLoadingFileObserver(this);
                mj0Var.d(null, false, z4);
                this.f36267e = -1;
                return;
            }
            i12 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
            DownloadController.getInstance(i12).addLoadingFileObserver(this.f36268f.path, this);
            this.f36267e = 1;
            Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f36268f.path);
            mj0Var.d(getResources().getDrawable(R.drawable.circle), true, z4);
            if (fileProgress != null) {
                f10 = fileProgress.floatValue();
            }
            mj0Var.e(f10, false);
            invalidate();
        } else if (exists) {
            i11 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            this.f36267e = -1;
            mj0Var.d(null, false, z4);
            invalidate();
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this);
            this.f36267e = 1;
            Float fileProgress2 = ImageLoader.getInstance().getFileProgress(attachFileName);
            mj0Var.d(getResources().getDrawable(R.drawable.circle), true, z4);
            if (fileProgress2 != null) {
                f10 = fileProgress2.floatValue();
            }
            mj0Var.e(f10, z4);
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.f36266c) {
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
        this.f36264a.invalidate();
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
        canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21779k0);
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        a(false);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        org.telegram.ui.Components.p9 p9Var = this.f36266c;
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
        if (this.f36267e != 1) {
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
        this.f36265b.setText(charSequence);
    }
}
