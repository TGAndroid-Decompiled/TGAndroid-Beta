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
    public int f33941a;
    public final View f33942b;
    public final ArrayList f33943c;
    public final ArrayList d;
    public final ArrayList f33944e;
    public final Object f33945f;
    public EGLContext f33946g;
    public final Object h;
    public int f33947i;
    public hi.fa f33948j;
    public Object f33949k;
    public Object f33950l;
    public ha f33951m;
    public final h2.c f33952n;
    public Bitmap f33953o;
    public int f33954p;

    public ca(View view) {
        ArrayList arrayList = new ArrayList();
        this.f33943c = arrayList;
        this.d = new ArrayList();
        this.f33944e = new ArrayList();
        this.f33945f = new Object();
        this.h = new Object();
        this.f33952n = new h2.c(0, new lg(this, 14));
        this.f33954p = 0;
        this.f33942b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new bi.r2(this, 11));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f33945f) {
            try {
                if (this.f33946g == null) {
                    this.f33946g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ha haVar = this.f33951m;
        if (haVar == null) {
            return this.f33953o;
        }
        synchronized (haVar.f35837n) {
            try {
                if (!haVar.f35840q) {
                    bitmap = null;
                } else {
                    bitmap = haVar.f35839p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f33953o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f33950l != null) {
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
            ((ga) obj).f35433b.invalidate();
        }
        ArrayList arrayList2 = this.f33944e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ha haVar = this.f33951m;
        if (haVar != null) {
            synchronized (haVar.f35837n) {
                haVar.f35840q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f33954p;
        this.f33954p = i7 + 1;
        sb2.append(i7);
        this.f33953o = this.f33952n.s(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(hi.fa faVar, Object obj) {
        this.f33948j = faVar;
        this.f33949k = obj;
        this.f33947i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f33950l = renderNode2;
            return;
        }
        this.f33950l = null;
    }
}
