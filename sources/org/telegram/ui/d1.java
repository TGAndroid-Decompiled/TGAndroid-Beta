package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

public final class d1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.i9 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public TL_iv.pageBlockAudio G;
    public TLRPC.Document H;
    public MessageObject I;

    public final d70 f37219a;

    public final k4 f37220b;

    public f3 f37221c;
    public f3 d;

    public final RadialProgress2 f37222e;

    public final org.telegram.ui.Components.mn0 f37223f;
    public boolean h;

    public int f37224n;

    public final int f37225r;

    public int f37226s;
    public String v;

    public f3 f37227w;

    public StaticLayout f37228x;

    public int f37229y;

    public d1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37225r = AndroidUtilities.dp(58.0f);
        this.f37219a = d70Var;
        this.f37220b = k4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f37222e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.F = DownloadController.getInstance(((m4) d70Var).T).generateObserverTag();
        org.telegram.ui.Components.mn0 mn0Var = new org.telegram.ui.Components.mn0(this);
        this.f37223f = mn0Var;
        mn0Var.h = new c1(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.D;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 3 ? 3 : 0;
    }

    public final void a(boolean z10) {
        int i10 = ((m4) this.f37219a).T;
        String attachFileName = FileLoader.getAttachFileName(this.H);
        boolean zExists = FileLoader.getInstance(i10).getPathToAttach(this.H, true).exists();
        boolean zIsEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f37222e;
        if (zIsEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (zExists) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.I);
            if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                this.D = 0;
            } else {
                this.D = 1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.D = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z10);
                } else {
                    radialProgress2.o(0.0f, z10);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.D = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        b();
    }

    public final void b() {
        MessageObject messageObject;
        int i10;
        if (this.H == null || (messageObject = this.I) == null) {
            return;
        }
        org.telegram.ui.Components.mn0 mn0Var = this.f37223f;
        if (!mn0Var.f30708e) {
            mn0Var.i(messageObject.audioProgress);
        }
        if (MediaController.getInstance().isPlayingMessage(this.I)) {
            i10 = this.I.audioProgressSec;
        } else {
            i10 = 0;
            for (int i11 = 0; i11 < this.H.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = this.H.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
            }
        }
        String shortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.v;
        if (str == null || !str.equals(shortDuration)) {
            this.v = shortDuration;
            TextPaint textPaint = m4.f40309a1;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.f37228x = new StaticLayout(shortDuration, textPaint, (int) Math.ceil(textPaint.measureText(shortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        m4.f40309a1.setColor(this.f37219a.b());
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f37227w;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f37221c;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            arrayList.add(f3Var3);
        }
    }

    public MessageObject getMessageObject() {
        return this.I;
    }

    @Override
    public int getObserverTag() {
        return this.F;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        f3 f3Var = this.f37227w;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f37221c;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            f3Var3.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((m4) this.f37219a).T).removeLoadingFileObserver(this);
        f3 f3Var = this.f37227w;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f37221c;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
        f3 f3Var3 = this.d;
        if (f3Var3 != null) {
            f3Var3.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.G == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23152ie;
        int i11 = org.telegram.ui.ActionBar.g6.f23170je;
        int i12 = org.telegram.ui.ActionBar.g6.f23363uc;
        int i13 = org.telegram.ui.ActionBar.g6.f23379vc;
        RadialProgress2 radialProgress2 = this.f37222e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.g6.Bd;
        d70 d70Var = this.f37219a;
        ((m4) d70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f37229y, this.A);
        this.f37223f.b(canvas);
        canvas.restore();
        if (this.f37228x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.B, AndroidUtilities.dp(6.0f) + this.A);
            this.f37228x.draw(canvas);
            canvas.restore();
        }
        if (this.f37227w != null) {
            canvas.save();
            this.f37227w.f37923s = AndroidUtilities.dp(54.0f) + this.B;
            this.f37227w.v = this.A - AndroidUtilities.dp(16.0f);
            f3 f3Var = this.f37227w;
            canvas.translate(f3Var.f37923s, f3Var.v);
            m4.v(d70Var, canvas, this, 0);
            this.f37227w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        f3 f3Var2 = this.f37221c;
        int i16 = this.f37225r;
        if (f3Var2 != null) {
            canvas.save();
            f3 f3Var3 = this.f37221c;
            int i17 = this.f37224n;
            f3Var3.f37923s = i17;
            f3Var3.v = i16;
            canvas.translate(i17, i16);
            m4.v(d70Var, canvas, this, i15);
            this.f37221c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            f3 f3Var4 = this.d;
            int i18 = this.f37224n;
            f3Var4.f37923s = i18;
            int i19 = this.f37226s;
            f3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            m4.v(d70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.G, getMeasuredHeight());
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        a(true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVAudio));
        if (this.f37227w != null) {
            sb2.append(", ");
            sb2.append(this.f37227w.d.getText());
        }
        if (this.f37221c != null) {
            sb2.append(", ");
            sb2.append(this.f37221c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i10);
        int iDp2 = AndroidUtilities.dp(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.G;
        if (pageblockaudio != null) {
            int i12 = pageblockaudio.level;
            if (i12 > 0) {
                this.f37224n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i12 * 14);
            } else {
                this.f37224n = AndroidUtilities.dp(18.0f);
            }
            int iDp3 = (size - this.f37224n) - AndroidUtilities.dp(18.0f);
            int iDp4 = AndroidUtilities.dp(44.0f);
            this.B = AndroidUtilities.dp(16.0f);
            int iDp5 = AndroidUtilities.dp(5.0f);
            this.C = iDp5;
            int i13 = this.B;
            this.f37222e.q(i13, iDp5, i13 + iDp4, iDp5 + iDp4);
            TL_iv.pageBlockAudio pageblockaudio2 = this.G;
            f3 f3VarQ = m4.q(this.f37219a, this, null, pageblockaudio2.caption.text, iDp3, this.f37225r, pageblockaudio2, this.f37220b);
            this.f37221c = f3VarQ;
            if (f3VarQ != null) {
                int height = this.f37221c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f37226s = height;
                iDp2 = org.telegram.messenger.y1.C(8.0f, height, iDp2);
            }
            iDp = iDp2;
            TL_iv.pageBlockAudio pageblockaudio3 = this.G;
            f3 f3VarP = m4.p(this.f37219a, this, null, pageblockaudio3.caption.credit, iDp3, this.f37225r + this.f37226s, pageblockaudio3, this.f37220b.C ? org.telegram.ui.Components.tv0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.f37220b);
            this.d = f3VarP;
            if (f3VarP != null) {
                iDp += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.G.level <= 0) {
                iDp += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.I.getMusicAuthor(false);
            String musicTitle = this.I.getMusicTitle(false);
            int iC = org.telegram.messenger.y1.C(50.0f, this.B, iDp4);
            this.f37229y = iC;
            int iDp6 = (size - iC) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f37227w = null;
                this.A = ((iDp4 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            } else {
                if (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(a9.p.w(musicAuthor, " - ", musicTitle));
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.g6.O2, iDp6, TextUtils.TruncateAt.END);
                f3 f3Var = new f3(this.f37219a);
                this.f37227w = f3Var;
                f3Var.d = new StaticLayout(charSequenceEllipsize, m4.f40309a1, iDp6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f37227w.f37921n = this.G;
                this.A = AndroidUtilities.dp(11.0f) + ((iDp4 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            }
            this.f37223f.j(iDp6, AndroidUtilities.dp(30.0f));
        } else {
            iDp = 1;
        }
        setMeasuredDimension(size, iDp);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f37222e.o(Math.min(1.0f, j10 / j11), true);
        if (this.D != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f37222e.o(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.f37223f.f(motionEvent.getX() - this.f37229y, motionEvent.getY() - this.A, motionEvent.getAction())) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (this.D != -1) {
                int i10 = this.B;
                if (x8 >= i10 && x8 <= AndroidUtilities.dp(48.0f) + i10) {
                    int i11 = this.C;
                    if (y10 >= i11 && y10 <= AndroidUtilities.dp(48.0f) + i11) {
                        this.E = 1;
                        invalidate();
                    } else if (this.D == 0) {
                        this.E = 1;
                        invalidate();
                    }
                } else if (this.D == 0) {
                    this.E = 1;
                    invalidate();
                }
            } else if (this.D == 0) {
                this.E = 1;
                invalidate();
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.E == 1) {
                this.E = 0;
                playSoundEffect(0);
                int i12 = ((m4) this.f37219a).T;
                int i13 = this.D;
                k4 k4Var = this.f37220b;
                RadialProgress2 radialProgress2 = this.f37222e;
                if (i13 == 0) {
                    if (k4Var != null && MediaController.getInstance().setPlaylist(k4Var.v, this.I, 0L, false, null)) {
                        this.D = 1;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i13 == 1) {
                    if (MediaController.getInstance().lambda$startAudioAgain$7(this.I)) {
                        this.D = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                } else if (i13 == 2) {
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i12).loadFile(this.H, k4Var == null ? null : k4Var.A, 1, 1);
                    this.D = 3;
                    radialProgress2.setIcon(getIconForCurrentState(), true, true);
                    invalidate();
                } else if (i13 == 3) {
                    FileLoader.getInstance(i12).cancelLoadFile(this.H);
                    this.D = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            }
        } else if (motionEvent.getAction() == 3) {
            this.E = 0;
        }
        if (this.E == 0) {
            if (!m4.l(this.f37219a, this.f37220b, motionEvent, this, this.f37221c, this.f37224n, this.f37225r)) {
                if (!m4.l(this.f37219a, this.f37220b, motionEvent, this, this.d, this.f37224n, this.f37225r + this.f37226s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
