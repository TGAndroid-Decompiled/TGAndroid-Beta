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
public final class y9 {
    public int f40599a;
    public final View f40600b;
    public final ArrayList f40601c;
    public final ArrayList d;
    public final ArrayList f40602e;
    public final Object f40603f;
    public EGLContext f40604g;
    public final Object h;
    public int f40605i;
    public fi.ha f40606j;
    public Object f40607k;
    public Object f40608l;
    public da f40609m;
    public final h2.c f40610n;
    public Bitmap f40611o;
    public int f40612p;

    public y9(View view) {
        ArrayList arrayList = new ArrayList();
        this.f40601c = arrayList;
        this.d = new ArrayList();
        this.f40602e = new ArrayList();
        this.f40603f = new Object();
        this.h = new Object();
        this.f40610n = new h2.c(0, new xf(this, 14));
        this.f40612p = 0;
        this.f40600b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new bi.m6(this, 7));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f40603f) {
            try {
                if (this.f40604g == null) {
                    this.f40604g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        da daVar = this.f40609m;
        if (daVar == null) {
            return this.f40611o;
        }
        synchronized (daVar.f32840n) {
            try {
                if (!daVar.f32843q) {
                    bitmap = null;
                } else {
                    bitmap = daVar.f32842p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f40611o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f40608l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ca) obj).f32471b.invalidate();
        }
        ArrayList arrayList2 = this.f40602e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        da daVar = this.f40609m;
        if (daVar != null) {
            synchronized (daVar.f32840n) {
                daVar.f32843q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z9) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f40612p;
        this.f40612p = i7 + 1;
        sb2.append(i7);
        this.f40611o = this.f40610n.s(bitmap, sb2.toString(), 0, 0, z9);
    }

    public final void g(fi.ha haVar, Object obj) {
        this.f40606j = haVar;
        this.f40607k = obj;
        this.f40605i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f40608l = renderNode2;
            return;
        }
        this.f40608l = null;
    }
}
