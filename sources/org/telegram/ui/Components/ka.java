package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.telegram.messenger.AndroidUtilities;
public final class ka {
    public int f25719a;
    public final View f25720b;
    public final ArrayList f25721c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f25722f;
    public EGLContext f25723g;
    public final Object h;
    public int f25724i;
    public ci.xb f25725j;
    public Object f25726k;
    public Object f25727l;
    public qa f25728m;
    public final pa f25729n;
    public Bitmap f25730o;
    public int f25731p;

    public ka(View view) {
        ArrayList arrayList = new ArrayList();
        this.f25721c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f25722f = new Object();
        this.h = new Object();
        this.f25729n = new pa(0, new qg(this, 14));
        this.f25731p = 0;
        this.f25720b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.u2(this, 5));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f25722f) {
            try {
                if (this.f25723g == null) {
                    this.f25723g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        qa qaVar = this.f25728m;
        if (qaVar == null) {
            return this.f25730o;
        }
        synchronized (qaVar.f27618n) {
            try {
                if (!qaVar.f27621q) {
                    bitmap = null;
                } else {
                    bitmap = qaVar.f27620p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f25730o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f25727l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((oa) obj).f27031b.invalidate();
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        qa qaVar = this.f25728m;
        if (qaVar != null) {
            synchronized (qaVar.f27618n) {
                qaVar.f27621q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f25731p;
        this.f25731p = i10 + 1;
        sb2.append(i10);
        this.f25730o = this.f25729n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.xb xbVar, Object obj) {
        this.f25725j = xbVar;
        this.f25726k = obj;
        this.f25724i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f25727l = renderNode2;
            return;
        }
        this.f25727l = null;
    }
}
