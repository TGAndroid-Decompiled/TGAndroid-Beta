package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class q1 extends FrameLayout implements org.telegram.ui.Cells.g9 {
    public final p1 f50428a;
    public final org.telegram.ui.Components.m71 f50429b;
    public z2 f50430c;
    public z2 d;
    public int f50431e;
    public int f50432f;
    public int h;
    public int f50433n;
    public int f50434r;
    public boolean f50435s;
    public TL_iv.pageBlockEmbed f50436w;
    public final e4 f50437x;
    public final g4 f50438y;

    public q1(g4 g4Var, Context context, e4 e4Var) {
        super(context);
        this.f50438y = g4Var;
        this.f50437x = e4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.m71 m71Var = new org.telegram.ui.Components.m71(context, false, new l1(this));
            this.f50429b = m71Var;
            addView(m71Var);
            g4Var.O.add(this);
            p1 p1Var = new p1(this, context);
            this.f50428a = p1Var;
            p1Var.getSettings().setJavaScriptEnabled(true);
            p1Var.getSettings().setDomStorageEnabled(true);
            p1Var.getSettings().setAllowContentAccess(true);
            p1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            p1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            p1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(p1Var, true);
            p1Var.setWebChromeClient(new m1(this, 0));
            p1Var.setWebViewClient(new n1(this, 0));
            addView(p1Var);
            return;
        }
        this.f50429b = null;
        this.f50428a = null;
    }

    public final void a(boolean z10) {
        p1 p1Var = this.f50428a;
        if (p1Var != null) {
            try {
                p1Var.stopLoading();
                p1Var.loadUrl("about:blank");
                if (z10) {
                    p1Var.destroy();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.f50436w = null;
        org.telegram.ui.Components.m71 m71Var = this.f50429b;
        if (m71Var != null) {
            m71Var.b();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50430c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50430c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f50438y.W) {
            this.f50436w = null;
        }
        z2 z2Var = this.f50430c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50436w != null) {
            z2 z2Var = this.f50430c;
            g4 g4Var = this.f50438y;
            int i7 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f50431e, this.f50432f);
                g4.t(g4Var, canvas, this, 0);
                this.f50430c.d(canvas, this);
                canvas.restore();
                i7 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f50431e, this.f50432f + this.h);
                g4.t(g4Var, canvas, this, i7);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.M0(2131754868, null));
        if (this.f50430c != null) {
            sb2.append(", ");
            sb2.append(this.f50430c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        p1 p1Var = this.f50428a;
        if (p1Var != null) {
            int i13 = this.f50433n;
            p1Var.layout(i13, 0, p1Var.getMeasuredWidth() + i13, p1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.m71 m71Var = this.f50429b;
        if (m71Var != null && m71Var.getParent() == this) {
            int i14 = this.f50433n;
            m71Var.layout(i14, 0, m71Var.getMeasuredWidth() + i14, m71Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f50430c;
        int i7 = this.f50431e;
        int i10 = this.f50432f;
        g4 g4Var = this.f50438y;
        if (!g4.j(g4Var, this.f50437x, motionEvent, this, z2Var, i7, i10)) {
            if (!g4.j(g4Var, this.f50437x, motionEvent, this, this.d, this.f50431e, this.f50432f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
