package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class j extends FrameLayout implements zlb {
    public final i a;
    public final hyc b;
    public cw c;
    public cw d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed w;
    public final ex x;
    public final o y;

    public j(o oVar, Activity activity, ex exVar) {
        super(activity);
        this.y = oVar;
        this.x = exVar;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            hyc hycVar = new hyc(activity, false, new ru(this));
            this.b = hycVar;
            addView(hycVar);
            oVar.O.add(this);
            i iVar = new i(this, activity);
            this.a = iVar;
            iVar.getSettings().setJavaScriptEnabled(true);
            iVar.getSettings().setDomStorageEnabled(true);
            iVar.getSettings().setAllowContentAccess(true);
            iVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
            iVar.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            iVar.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(iVar, true);
            iVar.setWebChromeClient(new su(this, (byte) 0));
            iVar.setWebViewClient(new tu(this, (byte) 0));
            addView(iVar);
            return;
        }
        this.b = null;
        this.a = null;
    }

    public final void a(boolean z) {
        i iVar = this.a;
        if (iVar != null) {
            try {
                iVar.stopLoading();
                iVar.loadUrl("about:blank");
                if (z) {
                    iVar.destroy();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        this.w = null;
        hyc hycVar = this.b;
        if (hycVar != null) {
            hycVar.b();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.y.W) {
            this.w = null;
        }
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.w != null) {
            cw cwVar = this.c;
            o oVar = this.y;
            int i = 0;
            if (cwVar != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(oVar, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f + this.h);
                o.s(oVar, canvas, this, i);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(ob6.M0(2131754863, null));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i iVar = this.a;
        if (iVar != null) {
            int i5 = this.n;
            iVar.layout(i5, 0, iVar.getMeasuredWidth() + i5, iVar.getMeasuredHeight());
        }
        hyc hycVar = this.b;
        if (hycVar != null && hycVar.getParent() == this) {
            int i6 = this.n;
            hycVar.layout(i6, 0, hycVar.getMeasuredWidth() + i6, hycVar.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cw cwVar = this.c;
        int i = this.e;
        int i2 = this.f;
        o oVar = this.y;
        if (!o.i(oVar, this.x, motionEvent, this, cwVar, i, i2)) {
            if (!o.i(oVar, this.x, motionEvent, this, this.d, this.e, this.f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
