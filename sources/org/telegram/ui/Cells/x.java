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
import org.telegram.ui.Components.pt;
import org.telegram.ui.b20;
public final class x extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public static final int L = 0;
    public final int E;
    public int F;
    public int G;
    public final RadialProgress2 H;
    public final int I;
    public final SpannableStringBuilder J;
    public final org.telegram.ui.ActionBar.c6 K;
    public boolean f22418a;
    public int f22419b;
    public int f22420c;
    public int d;
    public final int e;
    public org.telegram.ui.Components.x5 f22421f;
    public StaticLayout h;
    public final int f22422n;
    public org.telegram.ui.Components.x5 f22423r;
    public StaticLayout f22424s;
    public final ImageView v;
    public MessageObject f22425w;
    public boolean f22426x;
    public final int f22427y;

    public x(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        this.e = AndroidUtilities.dp(9.0f);
        this.f22422n = AndroidUtilities.dp(29.0f);
        int i12 = UserConfig.selectedAccount;
        this.f22427y = i12;
        setWillNotDraw(false);
        this.K = c6Var;
        this.I = i10;
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19764m6, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var), 1, -1));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, w7.z5.a(42.0f, 5.0f, 0.0f, 5.0f, 0.0f, 42, i11 | 16));
        imageView.setOnClickListener(new ah.f(7));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.H = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.g6.f19697ie, org.telegram.ui.ActionBar.g6.f19716je, org.telegram.ui.ActionBar.g6.f19921uc, org.telegram.ui.ActionBar.g6.f19939vc);
        this.E = DownloadController.getInstance(i12).generateObserverTag();
        setFocusable(true);
        if (i10 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new pt(), 0, 1, 0);
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
        int i11 = this.f22427y;
        RadialProgress2 radialProgress2 = this.H;
        if (i10 == 0) {
            if (this.G == 0) {
                FileLoader.getInstance(i11).loadFile(this.f22425w.getDocument(), this.f22425w, 1, 0);
            }
            if (MediaController.getInstance().findMessageInPlaylistAndPlay(this.f22425w)) {
                if (this.f22419b == 2 && this.G != 1) {
                    this.G = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.F = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.f22425w)) {
                this.F = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            FileLoader.getInstance(i11).loadFile(this.f22425w.getDocument(), this.f22425w, 1, 0);
            this.F = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.f22425w.getDocument());
            this.F = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        int i11;
        String fileName = this.f22425w.getFileName();
        File file = null;
        if (!TextUtils.isEmpty(this.f22425w.messageOwner.attachPath)) {
            File file2 = new File(this.f22425w.messageOwner.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        int i12 = this.f22427y;
        if (file == null) {
            file = FileLoader.getInstance(i12).getPathToAttach(this.f22425w.getDocument());
        }
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (SharedConfig.streamMedia && ((int) this.f22425w.getDialogId()) != 0) {
            if (exists) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f22419b = i11;
            exists = true;
        } else {
            this.G = -1;
        }
        int i13 = this.f22419b;
        RadialProgress2 radialProgress2 = this.H;
        if (i13 != 0) {
            if (this.f22425w.isOutOwner()) {
                i10 = org.telegram.ui.ActionBar.g6.Nb;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f19697ie;
            }
            radialProgress2.e.setColor(org.telegram.ui.ActionBar.g6.w0(i10, this.K));
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f22425w);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.F = 1;
            } else {
                this.F = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f22419b == 1) {
                DownloadController.getInstance(i12).removeLoadingFileObserver(this);
                this.G = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            DownloadController.getInstance(i12).addLoadingFileObserver(fileName, this.f22425w, this);
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
            boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.f22425w);
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
        return this.f22425w;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H.e();
        this.f22421f = org.telegram.ui.Components.b6.update(0, this, this.f22421f, this.h);
        this.f22423r = org.telegram.ui.Components.b6.update(0, this, this.f22423r, this.f22424s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.f();
        DownloadController.getInstance(this.f22427y).removeLoadingFileObserver(this);
        org.telegram.ui.Components.b6.release(this, this.f22421f);
        org.telegram.ui.Components.b6.release(this, this.f22423r);
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
            canvas.translate(dp + i10, this.e);
            this.h.draw(canvas);
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.h, this.f22421f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.f22424s;
        org.telegram.ui.ActionBar.c6 c6Var = this.K;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.g6.f19651g3.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
            canvas.save();
            if (!LocaleController.isRTL) {
                f10 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f10);
            if (LocaleController.isRTL && imageView.getVisibility() == 0) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            canvas.translate(dp2 + i11, this.f22422n);
            this.f22424s.draw(canvas);
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.f22424s, this.f22423r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19696id, c6Var);
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.f22426x && (U0 = org.telegram.ui.ActionBar.g6.U0("paintDivider", c6Var)) != null) {
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
        if (this.f22425w.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.f22425w.getMusicAuthor(), this.f22425w.getMusicTitle()));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.f22424s.getText()));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.ui.ActionBar.c6 c6Var = this.K;
        this.f22424s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(48.0f);
        try {
            String musicTitle = this.f22425w.getMusicTitle();
            CharSequence ellipsize = TextUtils.ellipsize(musicTitle.replace('\n', ' '), org.telegram.ui.ActionBar.g6.f19634f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.g6.f19634f3.measureText(musicTitle)), size), TextUtils.TruncateAt.END);
            CharSequence highlightText = AndroidUtilities.highlightText(ellipsize, this.f22425w.highlightedWords, c6Var);
            if (highlightText == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = highlightText;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, org.telegram.ui.ActionBar.g6.f19634f3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f22421f = org.telegram.ui.Components.b6.update(0, this, this.f22421f, staticLayout);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            CharSequence replace = this.f22425w.getMusicAuthor().replace('\n', ' ');
            if (this.I == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.J).append(' ').append(b20.d(this.f22425w, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.g6.f19651g3, size, TextUtils.TruncateAt.END);
            CharSequence highlightText2 = AndroidUtilities.highlightText(ellipsize2, this.f22425w.highlightedWords, c6Var);
            if (highlightText2 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = highlightText2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, org.telegram.ui.ActionBar.g6.f19651g3, size + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f22424s = staticLayout2;
            this.f22423r = org.telegram.ui.Components.b6.update(0, this, this.f22423r, staticLayout2);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        int dp2 = AndroidUtilities.dp(52.0f);
        if (LocaleController.isRTL) {
            dp = org.telegram.messenger.g0.B(8.0f, View.MeasureSpec.getSize(i10), dp2);
        } else {
            dp = AndroidUtilities.dp(8.0f);
        }
        int dp3 = AndroidUtilities.dp(4.0f) + dp;
        this.f22420c = dp3;
        int dp4 = AndroidUtilities.dp(6.0f);
        this.d = dp4;
        this.H.q(dp3, dp4, AndroidUtilities.dp(48.0f) + dp, AndroidUtilities.dp(50.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.H.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.f22419b != 0) {
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
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
