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
import android.view.MotionEvent;
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
import org.telegram.ui.Components.ps;
import org.telegram.ui.i10;

public final class x extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public static final int H = 0;
    public final int A;
    public int B;
    public int C;
    public final RadialProgress2 D;
    public final int E;
    public final SpannableStringBuilder F;
    public final org.telegram.ui.ActionBar.c6 G;

    public boolean f25908a;

    public int f25909b;

    public int f25910c;
    public int d;

    public final int f25911e;

    public org.telegram.ui.Components.p5 f25912f;
    public StaticLayout h;

    public final int f25913n;

    public org.telegram.ui.Components.p5 f25914r;

    public StaticLayout f25915s;
    public final ImageView v;

    public MessageObject f25916w;

    public boolean f25917x;

    public final int f25918y;

    public x(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25911e = AndroidUtilities.dp(9.0f);
        this.f25913n = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.f25918y = i11;
        setWillNotDraw(false);
        this.G = c6Var;
        this.E = i10;
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23215m6, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 1, -1));
        addView(imageView, h7.z5.d(42, 42.0f, (LocaleController.isRTL ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new ag.l2(10));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.D = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.g6.f23152ie, org.telegram.ui.ActionBar.g6.f23170je, org.telegram.ui.ActionBar.g6.f23363uc, org.telegram.ui.ActionBar.g6.f23379vc);
        this.A = DownloadController.getInstance(i11).generateObserverTag();
        setFocusable(true);
        if (i10 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.F = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ps(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i10 = this.B;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.C;
        if (i10 < 0) {
            return 4;
        }
        return i10 == 0 ? 2 : 3;
    }

    public final void a() {
        int i10 = this.B;
        int i11 = this.f25918y;
        RadialProgress2 radialProgress2 = this.D;
        if (i10 == 0) {
            if (this.C == 0) {
                FileLoader.getInstance(i11).loadFile(this.f25916w.getDocument(), this.f25916w, 1, 0);
            }
            if (MediaController.getInstance().findMessageInPlaylistAndPlay(this.f25916w)) {
                if (this.f25909b == 2 && this.C != 1) {
                    this.C = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.B = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.f25916w)) {
                this.B = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            FileLoader.getInstance(i11).loadFile(this.f25916w.getDocument(), this.f25916w, 1, 0);
            this.B = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.f25916w.getDocument());
            this.B = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean z10, boolean z11) {
        String fileName = this.f25916w.getFileName();
        File pathToAttach = null;
        if (!TextUtils.isEmpty(this.f25916w.messageOwner.attachPath)) {
            File file = new File(this.f25916w.messageOwner.attachPath);
            if (file.exists()) {
                pathToAttach = file;
            }
        }
        int i10 = this.f25918y;
        if (pathToAttach == null) {
            pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.f25916w.getDocument());
        }
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        if (pathToAttach.exists() && pathToAttach.length() == 0) {
            pathToAttach.delete();
        }
        boolean zExists = pathToAttach.exists();
        if (!SharedConfig.streamMedia || ((int) this.f25916w.getDialogId()) == 0) {
            this.C = -1;
        } else {
            this.f25909b = zExists ? 1 : 2;
            zExists = true;
        }
        int i11 = this.f25909b;
        RadialProgress2 radialProgress2 = this.D;
        if (i11 == 0) {
            if (zExists) {
                DownloadController.getInstance(i10).removeLoadingFileObserver(this);
                boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f25916w);
                if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.B = 0;
                } else {
                    this.B = 1;
                }
                radialProgress2.o(1.0f, z11);
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
                invalidate();
                return;
            }
            DownloadController.getInstance(i10).addLoadingFileObserver(fileName, this);
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                this.B = 4;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z11);
                } else {
                    radialProgress2.o(0.0f, z11);
                }
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            } else {
                this.B = 2;
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            }
            invalidate();
            return;
        }
        radialProgress2.f26467e.setColor(org.telegram.ui.ActionBar.g6.v0(this.f25916w.isOutOwner() ? org.telegram.ui.ActionBar.g6.Nb : org.telegram.ui.ActionBar.g6.f23152ie, this.G));
        boolean zIsPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.f25916w);
        if (!zIsPlayingMessage2 || (zIsPlayingMessage2 && MediaController.getInstance().isMessagePaused())) {
            this.B = 0;
        } else {
            this.B = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.f25909b == 1) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.C = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        DownloadController.getInstance(i10).addLoadingFileObserver(fileName, this.f25916w, this);
        if (!FileLoader.getInstance(i10).isLoadingFile(fileName)) {
            this.C = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.C = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
        if (fileProgress2 != null) {
            radialProgress2.o(fileProgress2.floatValue(), z11);
        } else {
            radialProgress2.o(0.0f, z11);
        }
    }

    public MessageObject getMessageObject() {
        return this.f25916w;
    }

    @Override
    public int getObserverTag() {
        return this.A;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.e();
        this.f25912f = org.telegram.ui.Components.t5.update(0, this, this.f25912f, this.h);
        this.f25914r = org.telegram.ui.Components.t5.update(0, this, this.f25914r, this.f25915s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.f();
        DownloadController.getInstance(this.f25918y).removeLoadingFileObserver(this);
        org.telegram.ui.Components.t5.release(this, this.f25912f);
        org.telegram.ui.Components.t5.release(this, this.f25914r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paintT0;
        StaticLayout staticLayout = this.h;
        int iDp = 0;
        ImageView imageView = this.v;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : AndroidUtilities.leftBaseline) + ((LocaleController.isRTL && imageView.getVisibility() == 0) ? AndroidUtilities.dp(32.0f) : 0), this.f25911e);
            this.h.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.h, this.f25912f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f25915s;
        org.telegram.ui.ActionBar.c6 c6Var = this.G;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.g6.f23105g3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
            canvas.save();
            int iDp2 = AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL && imageView.getVisibility() == 0) {
                iDp = AndroidUtilities.dp(32.0f);
            }
            canvas.translate(iDp2 + iDp, this.f25913n);
            this.f25915s.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f25915s, this.f25914r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23151id, c6Var);
        RadialProgress2 radialProgress2 = this.D;
        radialProgress2.d = iV0;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.f25917x || (paintT0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var)) == null) {
            return;
        }
        if (LocaleController.isRTL) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight(), paintT0);
        } else {
            canvas.drawRect(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getHeight() - 1, getWidth(), getHeight(), paintT0);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        b(true, z10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f25916w.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.f25916w.getMusicAuthor(), this.f25916w.getMusicTitle()));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f25915s.getText()));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.c6 c6Var = this.G;
        this.f25915s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(48.0f);
        try {
            String musicTitle = this.f25916w.getMusicTitle();
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(musicTitle.replace('\n', ' '), org.telegram.ui.ActionBar.g6.f23087f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.g6.f23087f3.measureText(musicTitle)), size), TextUtils.TruncateAt.END);
            CharSequence charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceEllipsize, this.f25916w.highlightedWords, c6Var);
            StaticLayout staticLayout = new StaticLayout(charSequenceHighlightText == null ? charSequenceEllipsize : charSequenceHighlightText, org.telegram.ui.ActionBar.g6.f23087f3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f25912f = org.telegram.ui.Components.t5.update(0, this, this.f25912f, staticLayout);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            CharSequence charSequenceReplace = this.f25916w.getMusicAuthor().replace('\n', ' ');
            if (this.E == 1) {
                charSequenceReplace = new SpannableStringBuilder(charSequenceReplace).append(' ').append((CharSequence) this.F).append(' ').append(i10.d(this.f25916w, true, 2, null));
            }
            CharSequence charSequenceEllipsize2 = TextUtils.ellipsize(charSequenceReplace, org.telegram.ui.ActionBar.g6.f23105g3, size, TextUtils.TruncateAt.END);
            CharSequence charSequenceHighlightText2 = AndroidUtilities.highlightText(charSequenceEllipsize2, this.f25916w.highlightedWords, c6Var);
            StaticLayout staticLayout2 = new StaticLayout(charSequenceHighlightText2 == null ? charSequenceEllipsize2 : charSequenceHighlightText2, org.telegram.ui.ActionBar.g6.f23105g3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f25915s = staticLayout2;
            this.f25914r = org.telegram.ui.Components.t5.update(0, this, this.f25914r, staticLayout2);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        int iB = LocaleController.isRTL ? org.telegram.messenger.y1.B(8.0f, View.MeasureSpec.getSize(i10), AndroidUtilities.dp(52.0f)) : AndroidUtilities.dp(8.0f);
        int iDp = AndroidUtilities.dp(4.0f) + iB;
        this.f25910c = iDp;
        int iDp2 = AndroidUtilities.dp(6.0f);
        this.d = iDp2;
        this.D.q(iDp, iDp2, AndroidUtilities.dp(48.0f) + iB, AndroidUtilities.dp(50.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.D.o(Math.min(1.0f, j10 / j11), true);
        if (this.f25909b != 0) {
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
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iDp;
        int iDp2;
        int i10;
        if (this.f25916w == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int iDp3 = AndroidUtilities.dp(36.0f);
        boolean z10 = true;
        boolean z11 = this.C >= 0 && x8 >= (iDp2 = this.f25910c + (iDp = AndroidUtilities.dp(27.0f))) && x8 <= iDp2 + iDp3 && y10 >= (i10 = this.d + iDp) && y10 <= i10 + iDp3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.D;
        if (action == 0) {
            if (z11) {
                this.f25908a = true;
                radialProgress2.n(true, true);
                invalidate();
            }
            if (motionEvent.getAction() == 3) {
                return z10;
            }
            this.f25908a = false;
            return false;
        }
        if (this.f25908a) {
            if (motionEvent.getAction() == 1) {
                this.f25908a = false;
                playSoundEffect(0);
                int i11 = this.C;
                int i12 = this.f25918y;
                if (i11 == 0) {
                    this.C = 1;
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i12).loadFile(this.f25916w.getDocument(), this.f25916w, 3, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 1) {
                    if (MediaController.getInstance().isPlayingMessage(this.f25916w)) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                    this.C = 0;
                    FileLoader.getInstance(i12).cancelLoadFile(this.f25916w.getDocument());
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.f25908a = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !z11) {
                this.f25908a = false;
                invalidate();
            }
            radialProgress2.n(this.f25908a, true);
        }
        z10 = false;
        if (motionEvent.getAction() == 3) {
            return z10;
        }
        this.f25908a = false;
        return false;
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
