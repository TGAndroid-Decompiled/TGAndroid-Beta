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
public final class ca {
    public int f34089a;
    public final View f34090b;
    public final ArrayList f34091c;
    public final ArrayList d;
    public final ArrayList f34092e;
    public final Object f34093f;
    public EGLContext f34094g;
    public final Object h;
    public int f34095i;
    public hi.fa f34096j;
    public Object f34097k;
    public Object f34098l;
    public ha f34099m;
    public final h2.c f34100n;
    public Bitmap f34101o;
    public int f34102p;

    public ca(View view) {
        ArrayList arrayList = new ArrayList();
        this.f34091c = arrayList;
        this.d = new ArrayList();
        this.f34092e = new ArrayList();
        this.f34093f = new Object();
        this.h = new Object();
        this.f34100n = new h2.c(0, new ng(this, 14));
        this.f34102p = 0;
        this.f34090b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new bi.x2(this, 11));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f34093f) {
            try {
                if (this.f34094g == null) {
                    this.f34094g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ha haVar = this.f34099m;
        if (haVar == null) {
            return this.f34101o;
        }
        synchronized (haVar.f35803n) {
            try {
                if (!haVar.f35806q) {
                    bitmap = null;
                } else {
                    bitmap = haVar.f35805p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f34101o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f34098l != null) {
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
            ((ga) obj).f35450b.invalidate();
        }
        ArrayList arrayList2 = this.f34092e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ha haVar = this.f34099m;
        if (haVar != null) {
            synchronized (haVar.f35803n) {
                haVar.f35806q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f34102p;
        this.f34102p = i7 + 1;
        sb2.append(i7);
        this.f34101o = this.f34100n.s(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(hi.fa faVar, Object obj) {
        this.f34096j = faVar;
        this.f34097k = obj;
        this.f34095i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f34098l = renderNode2;
            return;
        }
        this.f34098l = null;
    }
}
