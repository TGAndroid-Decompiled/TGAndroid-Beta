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
public final class j extends FrameLayout implements eib {
    public final i a;
    public final stc b;
    public bw c;
    public bw d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed w;
    public final dx x;
    public final o y;

    public j(o oVar, Activity activity, dx dxVar) {
        super(activity);
        this.y = oVar;
        this.x = dxVar;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            stc stcVar = new stc(activity, false, new qu(this));
            this.b = stcVar;
            addView(stcVar);
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
            iVar.setWebChromeClient(new ru(this, (byte) 0));
            iVar.setWebViewClient(new su(this, (byte) 0));
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
                fa4.g(e, true);
            }
        }
        this.w = null;
        stc stcVar = this.b;
        if (stcVar != null) {
            stcVar.b();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.y.W) {
            this.w = null;
        }
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.w != null) {
            bw bwVar = this.c;
            o oVar = this.y;
            int i = 0;
            if (bwVar != null) {
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
        StringBuilder sb = new StringBuilder(k96.M0(2131754867, null));
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
        stc stcVar = this.b;
        if (stcVar != null && stcVar.getParent() == this) {
            int i6 = this.n;
            stcVar.layout(i6, 0, stcVar.getMeasuredWidth() + i6, stcVar.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bw bwVar = this.c;
        int i = this.e;
        int i2 = this.f;
        o oVar = this.y;
        if (!o.i(oVar, this.x, motionEvent, this, bwVar, i, i2)) {
            if (!o.i(oVar, this.x, motionEvent, this, this.d, this.e, this.f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
