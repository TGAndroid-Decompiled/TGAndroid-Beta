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
public final class a1 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.n9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public MessageObject M;
    public final t70 f35792a;
    public final g4 f35793b;
    public b3 f35794c;
    public b3 d;
    public final RadialProgress2 f35795e;
    public final org.telegram.ui.Components.gp0 f35796f;
    public boolean h;
    public int f35797n;
    public final int f35798r;
    public int f35799s;
    public String v;
    public b3 f35800w;
    public StaticLayout f35801x;
    public int f35802y;

    public a1(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f35798r = AndroidUtilities.dp(58.0f);
        this.f35792a = t70Var;
        this.f35793b = g4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f35795e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.J = DownloadController.getInstance(((i4) t70Var).X).generateObserverTag();
        org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(this);
        this.f35796f = gp0Var;
        gp0Var.h = new z0(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.H;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        return 0;
    }

    public final void a(boolean z10) {
        int i10 = ((i4) this.f35792a).X;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.L, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f35795e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.M);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.H = 1;
            } else {
                this.H = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.H = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.H = 3;
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
        int i10;
        if (this.L != null && (messageObject = this.M) != null) {
            org.telegram.ui.Components.gp0 gp0Var = this.f35796f;
            if (!gp0Var.f26835e) {
                gp0Var.i(messageObject.audioProgress);
            }
            if (MediaController.getInstance().isPlayingMessage(this.M)) {
                i10 = this.M.audioProgressSec;
            } else {
                i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.L.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i10 = (int) documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            String str = this.v;
            if (str == null || !str.equals(formatShortDuration)) {
                this.v = formatShortDuration;
                TextPaint textPaint = i4.f38474e1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f35801x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            i4.f38474e1.setColor(this.f35792a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f35800w;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.f35794c;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
        b3 b3Var3 = this.d;
        if (b3Var3 != null) {
            arrayList.add(b3Var3);
        }
    }

    public MessageObject getMessageObject() {
        return this.M;
    }

    @Override
    public int getObserverTag() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        b3 b3Var = this.f35800w;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.f35794c;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
        b3 b3Var3 = this.d;
        if (b3Var3 != null) {
            b3Var3.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((i4) this.f35792a).X).removeLoadingFileObserver(this);
        b3 b3Var = this.f35800w;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.f35794c;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
        b3 b3Var3 = this.d;
        if (b3Var3 != null) {
            b3Var3.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.i6.f20896ie;
        int i11 = org.telegram.ui.ActionBar.i6.f20914je;
        int i12 = org.telegram.ui.ActionBar.i6.f21116uc;
        int i13 = org.telegram.ui.ActionBar.i6.f21133vc;
        RadialProgress2 radialProgress2 = this.f35795e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.i6.Bd;
        t70 t70Var = this.f35792a;
        ((i4) t70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.i6.x0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f35802y, this.E);
        this.f35796f.b(canvas);
        canvas.restore();
        if (this.f35801x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.F, AndroidUtilities.dp(6.0f) + this.E);
            this.f35801x.draw(canvas);
            canvas.restore();
        }
        if (this.f35800w != null) {
            canvas.save();
            this.f35800w.f36117s = AndroidUtilities.dp(54.0f) + this.F;
            this.f35800w.v = this.E - AndroidUtilities.dp(16.0f);
            b3 b3Var = this.f35800w;
            canvas.translate(b3Var.f36117s, b3Var.v);
            i4.v(t70Var, canvas, this, 0);
            this.f35800w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        b3 b3Var2 = this.f35794c;
        int i16 = this.f35798r;
        if (b3Var2 != null) {
            canvas.save();
            b3 b3Var3 = this.f35794c;
            int i17 = this.f35797n;
            b3Var3.f36117s = i17;
            b3Var3.v = i16;
            canvas.translate(i17, i16);
            i4.v(t70Var, canvas, this, i15);
            this.f35794c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            b3 b3Var4 = this.d;
            int i18 = this.f35797n;
            b3Var4.f36117s = i18;
            int i19 = this.f35799s;
            b3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            i4.v(t70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, t70Var, this.K, getMeasuredHeight());
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
        if (this.f35800w != null) {
            sb2.append(", ");
            sb2.append(this.f35800w.d.getText());
        }
        if (this.f35794c != null) {
            sb2.append(", ");
            sb2.append(this.f35794c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.K;
        if (pageblockaudio != null) {
            int i13 = pageblockaudio.level;
            if (i13 > 0) {
                this.f35797n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f35797n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f35797n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.F = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.G = dp4;
            int i14 = this.F;
            this.f35795e.q(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            b3 q6 = i4.q(this.f35792a, this, null, pageblockaudio2.caption.text, dp2, this.f35798r, pageblockaudio2, this.f35793b);
            this.f35794c = q6;
            if (q6 != null) {
                int height = this.f35794c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f35799s = height;
                dp = org.telegram.messenger.q.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f35798r + this.f35799s;
            if (this.f35793b.G) {
                alignment = org.telegram.ui.Components.mx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            b3 p5 = i4.p(this.f35792a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f35793b);
            this.d = p5;
            if (p5 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.M.getMusicAuthor(false);
            String musicTitle = this.M.getMusicTitle(false);
            int C = org.telegram.messenger.q.C(50.0f, this.F, dp3);
            this.f35802y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f35800w = null;
                this.E = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            } else {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(a1.g.D(musicAuthor, " - ", musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.m61(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.i6.O2, dp5, TextUtils.TruncateAt.END);
                b3 b3Var = new b3(this.f35792a);
                this.f35800w = b3Var;
                b3Var.d = new StaticLayout(ellipsize, i4.f38474e1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f35800w.f36115n = this.K;
                this.E = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            }
            this.f35796f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f35795e.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f35795e.o(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
