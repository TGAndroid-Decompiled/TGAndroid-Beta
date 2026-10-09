package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.st;
import org.telegram.ui.w10;
public final class x extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public static final int L = 0;
    public final int E;
    public int F;
    public int G;
    public final RadialProgress2 H;
    public final int I;
    public final SpannableStringBuilder J;
    public final org.telegram.ui.ActionBar.e6 K;
    public boolean f23705a;
    public int f23706b;
    public int f23707c;
    public int d;
    public final int f23708e;
    public org.telegram.ui.Components.x5 f23709f;
    public StaticLayout h;
    public final int f23710n;
    public org.telegram.ui.Components.x5 f23711r;
    public StaticLayout f23712s;
    public final ImageView v;
    public MessageObject f23713w;
    public boolean f23714x;
    public final int f23715y;

    public x(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i11;
        this.f23708e = AndroidUtilities.dp(9.0f);
        this.f23710n = AndroidUtilities.dp(29.0f);
        int i12 = UserConfig.selectedAccount;
        this.f23715y = i12;
        setWillNotDraw(false);
        this.K = e6Var;
        this.I = i10;
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20962m6, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var), 1, -1));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, w7.x5.a(42.0f, 5.0f, 0.0f, 5.0f, 0.0f, 42, i11 | 16));
        imageView.setOnClickListener(new ai.e2(6));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.H = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.i6.f20896ie, org.telegram.ui.ActionBar.i6.f20914je, org.telegram.ui.ActionBar.i6.f21116uc, org.telegram.ui.ActionBar.i6.f21133vc);
        this.E = DownloadController.getInstance(i12).generateObserverTag();
        setFocusable(true);
        if (i10 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new st(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.G;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    public final void a() {
        int i10 = this.F;
        int i11 = this.f23715y;
        RadialProgress2 radialProgress2 = this.H;
        if (i10 == 0) {
            if (this.G == 0) {
                FileLoader.getInstance(i11).loadFile(this.f23713w.getDocument(), this.f23713w, 1, 0);
            }
            if (MediaController.getInstance().findMessageInPlaylistAndPlay(this.f23713w)) {
                if (this.f23706b == 2 && this.G != 1) {
                    this.G = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.F = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.f23713w)) {
                this.F = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            FileLoader.getInstance(i11).loadFile(this.f23713w.getDocument(), this.f23713w, 1, 0);
            this.F = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.f23713w.getDocument());
            this.F = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        int i11;
        String fileName = this.f23713w.getFileName();
        File file = null;
        if (!TextUtils.isEmpty(this.f23713w.messageOwner.attachPath)) {
            File file2 = new File(this.f23713w.messageOwner.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        int i12 = this.f23715y;
        if (file == null) {
            file = FileLoader.getInstance(i12).getPathToAttach(this.f23713w.getDocument());
        }
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (SharedConfig.streamMedia && ((int) this.f23713w.getDialogId()) != 0) {
            if (exists) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f23706b = i11;
            exists = true;
        } else {
            this.G = -1;
        }
        int i13 = this.f23706b;
        RadialProgress2 radialProgress2 = this.H;
        if (i13 != 0) {
            if (this.f23713w.isOutOwner()) {
                i10 = org.telegram.ui.ActionBar.i6.Nb;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.f20896ie;
            }
            radialProgress2.f24263e.setColor(org.telegram.ui.ActionBar.i6.w0(i10, this.K));
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f23713w);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.F = 1;
            } else {
                this.F = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f23706b == 1) {
                DownloadController.getInstance(i12).removeLoadingFileObserver(this);
                this.G = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            DownloadController.getInstance(i12).addLoadingFileObserver(fileName, this.f23713w, this);
            if (!FileLoader.getInstance(i12).isLoadingFile(fileName)) {
                this.G = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.G = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            if (fileProgress != null) {
                radialProgress2.o(fileProgress.floatValue(), z11);
            } else {
                radialProgress2.o(0.0f, z11);
            }
        } else if (exists) {
            DownloadController.getInstance(i12).removeLoadingFileObserver(this);
            boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.f23713w);
            if (isPlayingMessage2 && (!isPlayingMessage2 || !MediaController.getInstance().isMessagePaused())) {
                this.F = 1;
            } else {
                this.F = 0;
            }
            radialProgress2.o(1.0f, z11);
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        } else {
            DownloadController.getInstance(i12).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(i12).isLoadingFile(fileName)) {
                this.F = 2;
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            } else {
                this.F = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress2 != null) {
                    radialProgress2.o(fileProgress2.floatValue(), z11);
                } else {
                    radialProgress2.o(0.0f, z11);
                }
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            }
            invalidate();
        }
    }

    public MessageObject getMessageObject() {
        return this.f23713w;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H.e();
        this.f23709f = org.telegram.ui.Components.b6.update(0, this, this.f23709f, this.h);
        this.f23711r = org.telegram.ui.Components.b6.update(0, this, this.f23711r, this.f23712s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.f();
        DownloadController.getInstance(this.f23715y).removeLoadingFileObserver(this);
        org.telegram.ui.Components.b6.release(this, this.f23709f);
        org.telegram.ui.Components.b6.release(this, this.f23711r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint U0;
        float f7;
        int i10;
        StaticLayout staticLayout = this.h;
        int i11 = 0;
        ImageView imageView = this.v;
        float f10 = 16.0f;
        if (staticLayout != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f7 = 16.0f;
            } else {
                f7 = AndroidUtilities.leftBaseline;
            }
            int dp = AndroidUtilities.dp(f7);
            if (LocaleController.isRTL && imageView.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(32.0f);
            } else {
                i10 = 0;
            }
            canvas.translate(dp + i10, this.f23708e);
            this.h.draw(canvas);
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.h, this.f23709f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f23712s;
        org.telegram.ui.ActionBar.e6 e6Var = this.K;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.i6.f20850g3.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21199z6, e6Var));
            canvas.save();
            if (!LocaleController.isRTL) {
                f10 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f10);
            if (LocaleController.isRTL && imageView.getVisibility() == 0) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            canvas.translate(dp2 + i11, this.f23710n);
            this.f23712s.draw(canvas);
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.f23712s, this.f23711r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20895id, e6Var);
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.f23714x && (U0 = org.telegram.ui.ActionBar.i6.U0("paintDivider", e6Var)) != null) {
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight(), U0);
            } else {
                canvas.drawRect(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight() - 1, getWidth(), getHeight(), U0);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        b(true, z10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f23713w.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.f23713w.getMusicAuthor(), this.f23713w.getMusicTitle()));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f23712s.getText()));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.ui.ActionBar.e6 e6Var = this.K;
        this.f23712s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(48.0f);
        try {
            String musicTitle = this.f23713w.getMusicTitle();
            CharSequence ellipsize = TextUtils.ellipsize(musicTitle.replace('\n', ' '), org.telegram.ui.ActionBar.i6.f20831f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.i6.f20831f3.measureText(musicTitle)), size), TextUtils.TruncateAt.END);
            CharSequence highlightText = AndroidUtilities.highlightText(ellipsize, this.f23713w.highlightedWords, e6Var);
            if (highlightText == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = highlightText;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, org.telegram.ui.ActionBar.i6.f20831f3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f23709f = org.telegram.ui.Components.b6.update(0, this, this.f23709f, staticLayout);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            CharSequence replace = this.f23713w.getMusicAuthor().replace('\n', ' ');
            if (this.I == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.J).append(' ').append(w10.d(this.f23713w, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.i6.f20850g3, size, TextUtils.TruncateAt.END);
            CharSequence highlightText2 = AndroidUtilities.highlightText(ellipsize2, this.f23713w.highlightedWords, e6Var);
            if (highlightText2 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = highlightText2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, org.telegram.ui.ActionBar.i6.f20850g3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f23712s = staticLayout2;
            this.f23711r = org.telegram.ui.Components.b6.update(0, this, this.f23711r, staticLayout2);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        int dp2 = AndroidUtilities.dp(52.0f);
        if (LocaleController.isRTL) {
            dp = org.telegram.messenger.q.B(8.0f, View.MeasureSpec.getSize(i10), dp2);
        } else {
            dp = AndroidUtilities.dp(8.0f);
        }
        int dp3 = AndroidUtilities.dp(4.0f) + dp;
        this.f23707c = dp3;
        int dp4 = AndroidUtilities.dp(6.0f);
        this.d = dp4;
        this.H.q(dp3, dp4, AndroidUtilities.dp(48.0f) + dp, AndroidUtilities.dp(50.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.H.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        if (this.f23706b != 0) {
            if (this.G != 1) {
                b(false, true);
            }
        } else if (this.F != 4) {
            b(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.H.o(1.0f, true);
        b(false, true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
