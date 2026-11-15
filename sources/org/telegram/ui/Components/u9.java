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
public final class u9 {
    public int f39966a;
    public final View f39967b;
    public final ArrayList f39968c;
    public final ArrayList d;
    public final ArrayList f39969e;
    public final Object f39970f;
    public EGLContext f39971g;
    public final Object h;
    public int f39972i;
    public hi.ea f39973j;
    public Object f39974k;
    public Object f39975l;
    public z9 f39976m;
    public final h2.c f39977n;
    public Bitmap f39978o;
    public int f39979p;

    public u9(View view) {
        ArrayList arrayList = new ArrayList();
        this.f39968c = arrayList;
        this.d = new ArrayList();
        this.f39969e = new ArrayList();
        this.f39970f = new Object();
        this.h = new Object();
        this.f39977n = new h2.c(0, new dg(this, 14));
        this.f39979p = 0;
        this.f39967b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new bi.x1(this, 11));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f39970f) {
            try {
                if (this.f39971g == null) {
                    this.f39971g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        z9 z9Var = this.f39976m;
        if (z9Var == null) {
            return this.f39978o;
        }
        synchronized (z9Var.f42317n) {
            try {
                if (!z9Var.f42320q) {
                    bitmap = null;
                } else {
                    bitmap = z9Var.f42319p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f39978o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f39975l != null) {
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
            ((y9) obj).f41943b.invalidate();
        }
        ArrayList arrayList2 = this.f39969e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        z9 z9Var = this.f39976m;
        if (z9Var != null) {
            synchronized (z9Var.f42317n) {
                z9Var.f42320q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f39979p;
        this.f39979p = i7 + 1;
        sb2.append(i7);
        this.f39978o = this.f39977n.s(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(hi.ea eaVar, Object obj) {
        this.f39973j = eaVar;
        this.f39974k = obj;
        this.f39972i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f39975l = renderNode2;
            return;
        }
        this.f39975l = null;
    }
}
