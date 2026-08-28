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
import org.telegram.ui.Components.qs;
import org.telegram.ui.f10;
public final class x extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public static final int H = 0;
    public final int A;
    public int B;
    public int C;
    public final RadialProgress2 D;
    public final int E;
    public final SpannableStringBuilder F;
    public final org.telegram.ui.ActionBar.b6 G;
    public boolean f25917a;
    public int f25918b;
    public int f25919c;
    public int d;
    public final int f25920e;
    public org.telegram.ui.Components.p5 f25921f;
    public StaticLayout h;
    public final int f25922n;
    public org.telegram.ui.Components.p5 f25923r;
    public StaticLayout f25924s;
    public final ImageView v;
    public MessageObject f25925w;
    public boolean f25926x;
    public final int f25927y;

    public x(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        this.f25920e = AndroidUtilities.dp(9.0f);
        this.f25922n = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.f25927y = i11;
        setWillNotDraw(false);
        this.G = b6Var;
        this.E = i9;
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23162m6, b6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 1, -1));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, g7.e6.d(42, 42.0f, i10 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new fh.n(9));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, b6Var);
        this.D = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.f6.f23099ie, org.telegram.ui.ActionBar.f6.f23116je, org.telegram.ui.ActionBar.f6.f23309uc, org.telegram.ui.ActionBar.f6.f23323vc);
        this.A = DownloadController.getInstance(i11).generateObserverTag();
        setFocusable(true);
        if (i9 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.F = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i9 = this.B;
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 2) {
            return 2;
        }
        if (i9 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i9 = this.C;
        if (i9 < 0) {
            return 4;
        }
        if (i9 == 0) {
            return 2;
        }
        return 3;
    }

    public final void a() {
        int i9 = this.B;
        int i10 = this.f25927y;
        RadialProgress2 radialProgress2 = this.D;
        if (i9 == 0) {
            if (this.C == 0) {
                FileLoader.getInstance(i10).loadFile(this.f25925w.getDocument(), this.f25925w, 1, 0);
            }
            if (MediaController.getInstance().findMessageInPlaylistAndPlay(this.f25925w)) {
                if (this.f25918b == 2 && this.C != 1) {
                    this.C = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.B = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i9 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.f25925w)) {
                this.B = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i9 == 2) {
            radialProgress2.o(0.0f, false);
            FileLoader.getInstance(i10).loadFile(this.f25925w.getDocument(), this.f25925w, 1, 0);
            this.B = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i9 == 4) {
            FileLoader.getInstance(i10).cancelLoadFile(this.f25925w.getDocument());
            this.B = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean z10, boolean z11) {
        int i9;
        int i10;
        String fileName = this.f25925w.getFileName();
        File file = null;
        if (!TextUtils.isEmpty(this.f25925w.messageOwner.attachPath)) {
            File file2 = new File(this.f25925w.messageOwner.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        int i11 = this.f25927y;
        if (file == null) {
            file = FileLoader.getInstance(i11).getPathToAttach(this.f25925w.getDocument());
        }
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (SharedConfig.streamMedia && ((int) this.f25925w.getDialogId()) != 0) {
            if (exists) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f25918b = i10;
            exists = true;
        } else {
            this.C = -1;
        }
        int i12 = this.f25918b;
        RadialProgress2 radialProgress2 = this.D;
        if (i12 != 0) {
            if (this.f25925w.isOutOwner()) {
                i9 = org.telegram.ui.ActionBar.f6.Nb;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.f23099ie;
            }
            radialProgress2.f26471e.setColor(org.telegram.ui.ActionBar.f6.v0(i9, this.G));
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f25925w);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.B = 1;
            } else {
                this.B = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f25918b == 1) {
                DownloadController.getInstance(i11).removeLoadingFileObserver(this);
                this.C = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            DownloadController.getInstance(i11).addLoadingFileObserver(fileName, this.f25925w, this);
            if (!FileLoader.getInstance(i11).isLoadingFile(fileName)) {
                this.C = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.C = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            if (fileProgress != null) {
                radialProgress2.o(fileProgress.floatValue(), z11);
            } else {
                radialProgress2.o(0.0f, z11);
            }
        } else if (exists) {
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.f25925w);
            if (isPlayingMessage2 && (!isPlayingMessage2 || !MediaController.getInstance().isMessagePaused())) {
                this.B = 1;
            } else {
                this.B = 0;
            }
            radialProgress2.o(1.0f, z11);
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        } else {
            DownloadController.getInstance(i11).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(i11).isLoadingFile(fileName)) {
                this.B = 2;
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            } else {
                this.B = 4;
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
        return this.f25925w;
    }

    @Override
    public int getObserverTag() {
        return this.A;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.e();
        this.f25921f = org.telegram.ui.Components.t5.update(0, this, this.f25921f, this.h);
        this.f25923r = org.telegram.ui.Components.t5.update(0, this, this.f25923r, this.f25924s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.f();
        DownloadController.getInstance(this.f25927y).removeLoadingFileObserver(this);
        org.telegram.ui.Components.t5.release(this, this.f25921f);
        org.telegram.ui.Components.t5.release(this, this.f25923r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint T0;
        float f10;
        int i9;
        StaticLayout staticLayout = this.h;
        int i10 = 0;
        ImageView imageView = this.v;
        float f11 = 16.0f;
        if (staticLayout != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f10 = 16.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            int dp = AndroidUtilities.dp(f10);
            if (LocaleController.isRTL && imageView.getVisibility() == 0) {
                i9 = AndroidUtilities.dp(32.0f);
            } else {
                i9 = 0;
            }
            canvas.translate(dp + i9, this.f25920e);
            this.h.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.h, this.f25921f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f25924s;
        org.telegram.ui.ActionBar.b6 b6Var = this.G;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.f6.f23052g3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
            canvas.save();
            if (!LocaleController.isRTL) {
                f11 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (LocaleController.isRTL && imageView.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(32.0f);
            }
            canvas.translate(dp2 + i10, this.f25922n);
            this.f25924s.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f25924s, this.f25923r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23098id, b6Var);
        RadialProgress2 radialProgress2 = this.D;
        radialProgress2.d = v02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.f25926x && (T0 = org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var)) != null) {
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight(), T0);
            } else {
                canvas.drawRect(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight() - 1, getWidth(), getHeight(), T0);
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
        if (this.f25925w.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.f25925w.getMusicAuthor(), this.f25925w.getMusicTitle()));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f25924s.getText()));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int dp;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.ui.ActionBar.b6 b6Var = this.G;
        this.f25924s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(48.0f);
        try {
            String musicTitle = this.f25925w.getMusicTitle();
            CharSequence ellipsize = TextUtils.ellipsize(musicTitle.replace('\n', ' '), org.telegram.ui.ActionBar.f6.f23034f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.f6.f23034f3.measureText(musicTitle)), size), TextUtils.TruncateAt.END);
            CharSequence highlightText = AndroidUtilities.highlightText(ellipsize, this.f25925w.highlightedWords, b6Var);
            if (highlightText == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = highlightText;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, org.telegram.ui.ActionBar.f6.f23034f3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f25921f = org.telegram.ui.Components.t5.update(0, this, this.f25921f, staticLayout);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            CharSequence replace = this.f25925w.getMusicAuthor().replace('\n', ' ');
            if (this.E == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.F).append(' ').append(f10.d(this.f25925w, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.f6.f23052g3, size, TextUtils.TruncateAt.END);
            CharSequence highlightText2 = AndroidUtilities.highlightText(ellipsize2, this.f25925w.highlightedWords, b6Var);
            if (highlightText2 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = highlightText2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, org.telegram.ui.ActionBar.f6.f23052g3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f25924s = staticLayout2;
            this.f25923r = org.telegram.ui.Components.t5.update(0, this, this.f25923r, staticLayout2);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        int dp2 = AndroidUtilities.dp(52.0f);
        if (LocaleController.isRTL) {
            dp = org.telegram.messenger.l0.B(8.0f, View.MeasureSpec.getSize(i9), dp2);
        } else {
            dp = AndroidUtilities.dp(8.0f);
        }
        int dp3 = AndroidUtilities.dp(4.0f) + dp;
        this.f25919c = dp3;
        int dp4 = AndroidUtilities.dp(6.0f);
        this.d = dp4;
        this.D.q(dp3, dp4, AndroidUtilities.dp(48.0f) + dp, AndroidUtilities.dp(50.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.D.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.f25918b != 0) {
            if (this.C != 1) {
                b(false, true);
            }
        } else if (this.B != 4) {
            b(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.D.o(1.0f, true);
        b(false, true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
