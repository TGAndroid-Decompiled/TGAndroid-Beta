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
import org.telegram.ui.Components.ys;
import org.telegram.ui.u10;
public final class x extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public static final int I = 0;
    public final int B;
    public int C;
    public int D;
    public final RadialProgress2 E;
    public final int F;
    public final SpannableStringBuilder G;
    public final org.telegram.ui.ActionBar.f6 H;
    public boolean f22523a;
    public int f22524b;
    public int f22525c;
    public int d;
    public final int e;
    public org.telegram.ui.Components.q5 f22526f;
    public StaticLayout h;
    public final int f22527n;
    public org.telegram.ui.Components.q5 f22528r;
    public StaticLayout f22529s;
    public final ImageView v;
    public MessageObject f22530w;
    public boolean f22531x;
    public final int f22532y;

    public x(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i11;
        this.e = AndroidUtilities.dp(9.0f);
        this.f22527n = AndroidUtilities.dp(29.0f);
        int i12 = UserConfig.selectedAccount;
        this.f22532y = i12;
        setWillNotDraw(false);
        this.H = f6Var;
        this.F = i10;
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20042m6, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var), 1, -1));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, k7.b6.d(42, 42.0f, i11 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new dg.m(8));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.E = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.j6.f19978ie, org.telegram.ui.ActionBar.j6.f19995je, org.telegram.ui.ActionBar.j6.f20188uc, org.telegram.ui.ActionBar.j6.f20206vc);
        this.B = DownloadController.getInstance(i12).generateObserverTag();
        setFocusable(true);
        if (i10 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.G = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ys(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i10 = this.C;
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
        int i10 = this.D;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    public final void a() {
        int i10 = this.C;
        int i11 = this.f22532y;
        RadialProgress2 radialProgress2 = this.E;
        if (i10 == 0) {
            if (this.D == 0) {
                FileLoader.getInstance(i11).loadFile(this.f22530w.getDocument(), this.f22530w, 1, 0);
            }
            if (MediaController.getInstance().findMessageInPlaylistAndPlay(this.f22530w)) {
                if (this.f22524b == 2 && this.D != 1) {
                    this.D = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.C = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.f22530w)) {
                this.C = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            FileLoader.getInstance(i11).loadFile(this.f22530w.getDocument(), this.f22530w, 1, 0);
            this.C = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.f22530w.getDocument());
            this.C = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean z4, boolean z10) {
        int i10;
        int i11;
        String fileName = this.f22530w.getFileName();
        File file = null;
        if (!TextUtils.isEmpty(this.f22530w.messageOwner.attachPath)) {
            File file2 = new File(this.f22530w.messageOwner.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        int i12 = this.f22532y;
        if (file == null) {
            file = FileLoader.getInstance(i12).getPathToAttach(this.f22530w.getDocument());
        }
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (SharedConfig.streamMedia && ((int) this.f22530w.getDialogId()) != 0) {
            if (exists) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f22524b = i11;
            exists = true;
        } else {
            this.D = -1;
        }
        int i13 = this.f22524b;
        RadialProgress2 radialProgress2 = this.E;
        if (i13 != 0) {
            if (this.f22530w.isOutOwner()) {
                i10 = org.telegram.ui.ActionBar.j6.Nb;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f19978ie;
            }
            radialProgress2.e.setColor(org.telegram.ui.ActionBar.j6.v0(i10, this.H));
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f22530w);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.C = 1;
            } else {
                this.C = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z4, z10);
            if (this.f22524b == 1) {
                DownloadController.getInstance(i12).removeLoadingFileObserver(this);
                this.D = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z4, z10);
                return;
            }
            DownloadController.getInstance(i12).addLoadingFileObserver(fileName, this.f22530w, this);
            if (!FileLoader.getInstance(i12).isLoadingFile(fileName)) {
                this.D = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z4, z10);
                return;
            }
            this.D = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z4, z10);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            if (fileProgress != null) {
                radialProgress2.o(fileProgress.floatValue(), z10);
            } else {
                radialProgress2.o(0.0f, z10);
            }
        } else if (exists) {
            DownloadController.getInstance(i12).removeLoadingFileObserver(this);
            boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.f22530w);
            if (isPlayingMessage2 && (!isPlayingMessage2 || !MediaController.getInstance().isMessagePaused())) {
                this.C = 1;
            } else {
                this.C = 0;
            }
            radialProgress2.o(1.0f, z10);
            radialProgress2.setIcon(getIconForCurrentState(), z4, z10);
            invalidate();
        } else {
            DownloadController.getInstance(i12).addLoadingFileObserver(fileName, this);
            if (!FileLoader.getInstance(i12).isLoadingFile(fileName)) {
                this.C = 2;
                radialProgress2.setIcon(getIconForCurrentState(), z4, z10);
            } else {
                this.C = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress2 != null) {
                    radialProgress2.o(fileProgress2.floatValue(), z10);
                } else {
                    radialProgress2.o(0.0f, z10);
                }
                radialProgress2.setIcon(getIconForCurrentState(), z4, z10);
            }
            invalidate();
        }
    }

    public MessageObject getMessageObject() {
        return this.f22530w;
    }

    @Override
    public int getObserverTag() {
        return this.B;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.e();
        this.f22526f = org.telegram.ui.Components.u5.update(0, this, this.f22526f, this.h);
        this.f22528r = org.telegram.ui.Components.u5.update(0, this, this.f22528r, this.f22529s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.f();
        DownloadController.getInstance(this.f22532y).removeLoadingFileObserver(this);
        org.telegram.ui.Components.u5.release(this, this.f22526f);
        org.telegram.ui.Components.u5.release(this, this.f22528r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint T0;
        float f10;
        int i10;
        StaticLayout staticLayout = this.h;
        int i11 = 0;
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
                i10 = AndroidUtilities.dp(32.0f);
            } else {
                i10 = 0;
            }
            canvas.translate(dp + i10, this.e);
            this.h.draw(canvas);
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.h, this.f22526f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f22529s;
        org.telegram.ui.ActionBar.f6 f6Var = this.H;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.j6.f19932g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20273z6, f6Var));
            canvas.save();
            if (!LocaleController.isRTL) {
                f11 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (LocaleController.isRTL && imageView.getVisibility() == 0) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            canvas.translate(dp2 + i11, this.f22527n);
            this.f22529s.draw(canvas);
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.f22529s, this.f22528r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977id, f6Var);
        RadialProgress2 radialProgress2 = this.E;
        radialProgress2.d = v02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.f22531x && (T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var)) != null) {
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight(), T0);
            } else {
                canvas.drawRect(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight() - 1, getWidth(), getHeight(), T0);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        b(true, z4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f22530w.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.f22530w.getMusicAuthor(), this.f22530w.getMusicTitle()));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f22529s.getText()));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.ui.ActionBar.f6 f6Var = this.H;
        this.f22529s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(48.0f);
        try {
            String musicTitle = this.f22530w.getMusicTitle();
            CharSequence ellipsize = TextUtils.ellipsize(musicTitle.replace('\n', ' '), org.telegram.ui.ActionBar.j6.f19914f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.j6.f19914f3.measureText(musicTitle)), size), TextUtils.TruncateAt.END);
            CharSequence highlightText = AndroidUtilities.highlightText(ellipsize, this.f22530w.highlightedWords, f6Var);
            if (highlightText == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = highlightText;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, org.telegram.ui.ActionBar.j6.f19914f3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f22526f = org.telegram.ui.Components.u5.update(0, this, this.f22526f, staticLayout);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            CharSequence replace = this.f22530w.getMusicAuthor().replace('\n', ' ');
            if (this.F == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.G).append(' ').append(u10.d(this.f22530w, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.j6.f19932g3, size, TextUtils.TruncateAt.END);
            CharSequence highlightText2 = AndroidUtilities.highlightText(ellipsize2, this.f22530w.highlightedWords, f6Var);
            if (highlightText2 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = highlightText2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, org.telegram.ui.ActionBar.j6.f19932g3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f22529s = staticLayout2;
            this.f22528r = org.telegram.ui.Components.u5.update(0, this, this.f22528r, staticLayout2);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        int dp2 = AndroidUtilities.dp(52.0f);
        if (LocaleController.isRTL) {
            dp = org.telegram.messenger.y3.B(8.0f, View.MeasureSpec.getSize(i10), dp2);
        } else {
            dp = AndroidUtilities.dp(8.0f);
        }
        int dp3 = AndroidUtilities.dp(4.0f) + dp;
        this.f22525c = dp3;
        int dp4 = AndroidUtilities.dp(6.0f);
        this.d = dp4;
        this.E.q(dp3, dp4, AndroidUtilities.dp(48.0f) + dp, AndroidUtilities.dp(50.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.E.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.f22524b != 0) {
            if (this.D != 1) {
                b(false, true);
            }
        } else if (this.C != 4) {
            b(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.E.o(1.0f, true);
        b(false, true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
