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
    public int f40587a;
    public final View f40588b;
    public final ArrayList f40589c;
    public final ArrayList d;
    public final ArrayList f40590e;
    public final Object f40591f;
    public EGLContext f40592g;
    public final Object h;
    public int f40593i;
    public fi.ha f40594j;
    public Object f40595k;
    public Object f40596l;
    public da f40597m;
    public final h2.c f40598n;
    public Bitmap f40599o;
    public int f40600p;

    public y9(View view) {
        ArrayList arrayList = new ArrayList();
        this.f40589c = arrayList;
        this.d = new ArrayList();
        this.f40590e = new ArrayList();
        this.f40591f = new Object();
        this.h = new Object();
        this.f40598n = new h2.c(0, new xf(this, 14));
        this.f40600p = 0;
        this.f40588b = view;
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
        synchronized (this.f40591f) {
            try {
                if (this.f40592g == null) {
                    this.f40592g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        da daVar = this.f40597m;
        if (daVar == null) {
            return this.f40599o;
        }
        synchronized (daVar.f32811n) {
            try {
                if (!daVar.f32814q) {
                    bitmap = null;
                } else {
                    bitmap = daVar.f32813p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f40599o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f40596l != null) {
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
            ((ca) obj).f32484b.invalidate();
        }
        ArrayList arrayList2 = this.f40590e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        da daVar = this.f40597m;
        if (daVar != null) {
            synchronized (daVar.f32811n) {
                daVar.f32814q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z9) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f40600p;
        this.f40600p = i7 + 1;
        sb2.append(i7);
        this.f40599o = this.f40598n.s(bitmap, sb2.toString(), 0, 0, z9);
    }

    public final void g(fi.ha haVar, Object obj) {
        this.f40594j = haVar;
        this.f40595k = obj;
        this.f40593i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f40596l = renderNode2;
            return;
        }
        this.f40596l = null;
    }
}
