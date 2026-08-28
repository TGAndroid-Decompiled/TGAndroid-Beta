package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
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
public final class c1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.m9 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public TL_iv.pageBlockAudio G;
    public TLRPC.Document H;
    public MessageObject I;
    public final a70 f37024a;
    public final j4 f37025b;
    public e3 f37026c;
    public e3 d;
    public final RadialProgress2 f37027e;
    public final org.telegram.ui.Components.ln0 f37028f;
    public boolean h;
    public int f37029n;
    public final int f37030r;
    public int f37031s;
    public String v;
    public e3 f37032w;
    public StaticLayout f37033x;
    public int f37034y;

    public c1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f37030r = AndroidUtilities.dp(58.0f);
        this.f37024a = a70Var;
        this.f37025b = j4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f37027e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.F = DownloadController.getInstance(((l4) a70Var).T).generateObserverTag();
        org.telegram.ui.Components.ln0 ln0Var = new org.telegram.ui.Components.ln0(this);
        this.f37028f = ln0Var;
        ln0Var.h = new b1(this, 0);
    }

    private int getIconForCurrentState() {
        int i9 = this.D;
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 2) {
            return 2;
        }
        if (i9 == 3) {
            return 3;
        }
        return 0;
    }

    public final void a(boolean z10) {
        int i9 = ((l4) this.f37024a).T;
        String attachFileName = FileLoader.getAttachFileName(this.H);
        boolean exists = FileLoader.getInstance(i9).getPathToAttach(this.H, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f37027e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i9).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.I);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.D = 1;
            } else {
                this.D = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i9).isLoadingFile(attachFileName)) {
                this.D = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.D = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z10);
                } else {
                    radialProgress2.o(0.0f, z10);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        b();
    }

    public final void b() {
        MessageObject messageObject;
        int i9;
        if (this.H != null && (messageObject = this.I) != null) {
            org.telegram.ui.Components.ln0 ln0Var = this.f37028f;
            if (!ln0Var.f30490e) {
                ln0Var.i(messageObject.audioProgress);
            }
            if (MediaController.getInstance().isPlayingMessage(this.I)) {
                i9 = this.I.audioProgressSec;
            } else {
                i9 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 >= this.H.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.H.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i9 = (int) documentAttribute.duration;
                        break;
                    }
                    i10++;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration(i9);
            String str = this.v;
            if (str == null || !str.equals(formatShortDuration)) {
                this.v = formatShortDuration;
                TextPaint textPaint = l4.f39988a1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f37033x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            l4.f39988a1.setColor(this.f37024a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f37032w;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.f37026c;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
        e3 e3Var3 = this.d;
        if (e3Var3 != null) {
            arrayList.add(e3Var3);
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
        e3 e3Var = this.f37032w;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.f37026c;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
        e3 e3Var3 = this.d;
        if (e3Var3 != null) {
            e3Var3.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((l4) this.f37024a).T).removeLoadingFileObserver(this);
        e3 e3Var = this.f37032w;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.f37026c;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
        e3 e3Var3 = this.d;
        if (e3Var3 != null) {
            e3Var3.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.G == null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.f23099ie;
        int i10 = org.telegram.ui.ActionBar.f6.f23116je;
        int i11 = org.telegram.ui.ActionBar.f6.f23309uc;
        int i12 = org.telegram.ui.ActionBar.f6.f23323vc;
        RadialProgress2 radialProgress2 = this.f37027e;
        radialProgress2.g(i9, i10, i11, i12);
        int i13 = org.telegram.ui.ActionBar.f6.Bd;
        a70 a70Var = this.f37024a;
        ((l4) a70Var).getClass();
        int i14 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.f6.w0(null, i13, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f37034y, this.A);
        this.f37028f.b(canvas);
        canvas.restore();
        if (this.f37033x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.B, AndroidUtilities.dp(6.0f) + this.A);
            this.f37033x.draw(canvas);
            canvas.restore();
        }
        if (this.f37032w != null) {
            canvas.save();
            this.f37032w.f37805s = AndroidUtilities.dp(54.0f) + this.B;
            this.f37032w.v = this.A - AndroidUtilities.dp(16.0f);
            e3 e3Var = this.f37032w;
            canvas.translate(e3Var.f37805s, e3Var.v);
            l4.v(a70Var, canvas, this, 0);
            this.f37032w.draw(canvas, this);
            canvas.restore();
            i14 = 1;
        }
        e3 e3Var2 = this.f37026c;
        int i15 = this.f37030r;
        if (e3Var2 != null) {
            canvas.save();
            e3 e3Var3 = this.f37026c;
            int i16 = this.f37029n;
            e3Var3.f37805s = i16;
            e3Var3.v = i15;
            canvas.translate(i16, i15);
            l4.v(a70Var, canvas, this, i14);
            this.f37026c.draw(canvas, this);
            canvas.restore();
            i14++;
        }
        if (this.d != null) {
            canvas.save();
            e3 e3Var4 = this.d;
            int i17 = this.f37029n;
            e3Var4.f37805s = i17;
            int i18 = this.f37031s;
            e3Var4.v = i15 + i18;
            canvas.translate(i17, i15 + i18);
            l4.v(a70Var, canvas, this, i14);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, a70Var, this.G, getMeasuredHeight());
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
        if (this.f37032w != null) {
            sb2.append(", ");
            sb2.append(this.f37032w.d.getText());
        }
        if (this.f37026c != null) {
            sb2.append(", ");
            sb2.append(this.f37026c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        Layout.Alignment alignment;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.G;
        if (pageblockaudio != null) {
            int i12 = pageblockaudio.level;
            if (i12 > 0) {
                this.f37029n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i12 * 14);
            } else {
                this.f37029n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f37029n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.B = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.C = dp4;
            int i13 = this.B;
            this.f37027e.q(i13, dp4, i13 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.G;
            e3 q10 = l4.q(this.f37024a, this, null, pageblockaudio2.caption.text, dp2, this.f37030r, pageblockaudio2, this.f37025b);
            this.f37026c = q10;
            if (q10 != null) {
                int height = this.f37026c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f37031s = height;
                dp = org.telegram.messenger.l0.C(8.0f, height, dp);
            }
            i11 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.G;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i14 = this.f37030r + this.f37031s;
            if (this.f37025b.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            e3 p6 = l4.p(this.f37024a, this, null, richText, dp2, i14, pageblockaudio3, alignment2, 0, this.f37025b);
            this.d = p6;
            if (p6 != null) {
                i11 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.G.level <= 0) {
                i11 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.I.getMusicAuthor(false);
            String musicTitle = this.I.getMusicTitle(false);
            int C = org.telegram.messenger.l0.C(50.0f, this.B, dp3);
            this.f37034y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f37032w = null;
                this.A = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            } else {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(aa.d.z(musicAuthor, " - ", musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.f6.O2, dp5, TextUtils.TruncateAt.END);
                e3 e3Var = new e3(this.f37024a);
                this.f37032w = e3Var;
                e3Var.d = new StaticLayout(ellipsize, l4.f39988a1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f37032w.f37803n = this.G;
                this.A = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.C;
            }
            this.f37028f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f37027e.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.D != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f37027e.o(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
