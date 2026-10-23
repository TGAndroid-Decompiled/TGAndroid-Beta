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
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public MessageObject M;
    public final b70 f35780a;
    public final j4 f35781b;
    public d3 f35782c;
    public d3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.zo0 f35783f;
    public boolean h;
    public int f35784n;
    public final int f35785r;
    public int f35786s;
    public String v;
    public d3 f35787w;
    public StaticLayout f35788x;
    public int f35789y;

    public c1(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f35785r = AndroidUtilities.dp(58.0f);
        this.f35780a = b70Var;
        this.f35781b = j4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.J = DownloadController.getInstance(((l4) b70Var).X).generateObserverTag();
        org.telegram.ui.Components.zo0 zo0Var = new org.telegram.ui.Components.zo0(this);
        this.f35783f = zo0Var;
        zo0Var.h = new b1(this, 0);
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
        int i10 = ((l4) this.f35780a).X;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.L, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.e;
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
            org.telegram.ui.Components.zo0 zo0Var = this.f35783f;
            if (!zo0Var.e) {
                zo0Var.i(messageObject.audioProgress);
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
                TextPaint textPaint = l4.f38742e1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f35788x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            l4.f38742e1.setColor(this.f35780a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35787w;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.f35782c;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
        d3 d3Var3 = this.d;
        if (d3Var3 != null) {
            arrayList.add(d3Var3);
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
        d3 d3Var = this.f35787w;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.f35782c;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
        d3 d3Var3 = this.d;
        if (d3Var3 != null) {
            d3Var3.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((l4) this.f35780a).X).removeLoadingFileObserver(this);
        d3 d3Var = this.f35787w;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.f35782c;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
        d3 d3Var3 = this.d;
        if (d3Var3 != null) {
            d3Var3.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.h6.f21090ie;
        int i11 = org.telegram.ui.ActionBar.h6.f21109je;
        int i12 = org.telegram.ui.ActionBar.h6.f21315uc;
        int i13 = org.telegram.ui.ActionBar.h6.f21333vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.h6.Bd;
        b70 b70Var = this.f35780a;
        ((l4) b70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.h6.x0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f35789y, this.E);
        this.f35783f.b(canvas);
        canvas.restore();
        if (this.f35788x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.F, AndroidUtilities.dp(6.0f) + this.E);
            this.f35788x.draw(canvas);
            canvas.restore();
        }
        if (this.f35787w != null) {
            canvas.save();
            this.f35787w.f36246s = AndroidUtilities.dp(54.0f) + this.F;
            this.f35787w.v = this.E - AndroidUtilities.dp(16.0f);
            d3 d3Var = this.f35787w;
            canvas.translate(d3Var.f36246s, d3Var.v);
            l4.v(b70Var, canvas, this, 0);
            this.f35787w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        d3 d3Var2 = this.f35782c;
        int i16 = this.f35785r;
        if (d3Var2 != null) {
            canvas.save();
            d3 d3Var3 = this.f35782c;
            int i17 = this.f35784n;
            d3Var3.f36246s = i17;
            d3Var3.v = i16;
            canvas.translate(i17, i16);
            l4.v(b70Var, canvas, this, i15);
            this.f35782c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            d3 d3Var4 = this.d;
            int i18 = this.f35784n;
            d3Var4.f36246s = i18;
            int i19 = this.f35786s;
            d3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            l4.v(b70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, b70Var, this.K, getMeasuredHeight());
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
        if (this.f35787w != null) {
            sb2.append(", ");
            sb2.append(this.f35787w.d.getText());
        }
        if (this.f35782c != null) {
            sb2.append(", ");
            sb2.append(this.f35782c.d.getText());
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
                this.f35784n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f35784n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f35784n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.F = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.G = dp4;
            int i14 = this.F;
            this.e.q(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            d3 q6 = l4.q(this.f35780a, this, null, pageblockaudio2.caption.text, dp2, this.f35785r, pageblockaudio2, this.f35781b);
            this.f35782c = q6;
            if (q6 != null) {
                int height = this.f35782c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f35786s = height;
                dp = org.telegram.messenger.g0.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f35785r + this.f35786s;
            if (this.f35781b.G) {
                alignment = org.telegram.ui.Components.fx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            d3 p5 = l4.p(this.f35780a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f35781b);
            this.d = p5;
            if (p5 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.M.getMusicAuthor(false);
            String musicTitle = this.M.getMusicTitle(false);
            int C = org.telegram.messenger.g0.C(50.0f, this.F, dp3);
            this.f35789y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f35787w = null;
                this.E = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            } else {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(a1.g.C(musicAuthor, " - ", musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.h6.O2, dp5, TextUtils.TruncateAt.END);
                d3 d3Var = new d3(this.f35780a);
                this.f35787w = d3Var;
                d3Var.d = new StaticLayout(ellipsize, l4.f38742e1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f35787w.f36244n = this.K;
                this.E = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            }
            this.f35783f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.e.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.e.o(1.0f, true);
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
