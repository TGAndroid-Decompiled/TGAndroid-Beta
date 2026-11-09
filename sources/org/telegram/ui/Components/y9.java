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
    public int f40671a;
    public final View f40672b;
    public final ArrayList f40673c;
    public final ArrayList d;
    public final ArrayList f40674e;
    public final Object f40675f;
    public EGLContext f40676g;
    public final Object h;
    public int f40677i;
    public fi.ha f40678j;
    public Object f40679k;
    public Object f40680l;
    public da f40681m;
    public final h2.c f40682n;
    public Bitmap f40683o;
    public int f40684p;

    public y9(View view) {
        ArrayList arrayList = new ArrayList();
        this.f40673c = arrayList;
        this.d = new ArrayList();
        this.f40674e = new ArrayList();
        this.f40675f = new Object();
        this.h = new Object();
        this.f40682n = new h2.c(0, new xf(this, 14));
        this.f40684p = 0;
        this.f40672b = view;
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
        synchronized (this.f40675f) {
            try {
                if (this.f40676g == null) {
                    this.f40676g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        da daVar = this.f40681m;
        if (daVar == null) {
            return this.f40683o;
        }
        synchronized (daVar.f32907n) {
            try {
                if (!daVar.f32910q) {
                    bitmap = null;
                } else {
                    bitmap = daVar.f32909p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f40683o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f40680l != null) {
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
            ((ca) obj).f32599b.invalidate();
        }
        ArrayList arrayList2 = this.f40674e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        da daVar = this.f40681m;
        if (daVar != null) {
            synchronized (daVar.f32907n) {
                daVar.f32910q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z9) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f40684p;
        this.f40684p = i7 + 1;
        sb2.append(i7);
        this.f40683o = this.f40682n.s(bitmap, sb2.toString(), 0, 0, z9);
    }

    public final void g(fi.ha haVar, Object obj) {
        this.f40678j = haVar;
        this.f40679k = obj;
        this.f40677i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f40680l = renderNode2;
            return;
        }
        this.f40680l = null;
    }
}
