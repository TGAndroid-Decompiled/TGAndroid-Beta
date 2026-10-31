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
public final class s9 {
    public int f30193a;
    public final View f30194b;
    public final ArrayList f30195c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f30196f;
    public EGLContext f30197g;
    public final Object h;
    public int f30198i;
    public vh.b8 f30199j;
    public Object f30200k;
    public Object f30201l;
    public x9 f30202m;
    public final e2.c f30203n;
    public Bitmap f30204o;
    public int f30205p;

    public s9(View view) {
        ArrayList arrayList = new ArrayList();
        this.f30195c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f30196f = new Object();
        this.h = new Object();
        this.f30203n = new e2.c(0, new tf(this, 15));
        this.f30205p = 0;
        this.f30194b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new l.d(this, 5));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f30196f) {
            try {
                if (this.f30197g == null) {
                    this.f30197g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        x9 x9Var = this.f30202m;
        if (x9Var == null) {
            return this.f30204o;
        }
        synchronized (x9Var.f32439n) {
            try {
                if (!x9Var.f32442q) {
                    bitmap = null;
                } else {
                    bitmap = x9Var.f32441p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f30204o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f30201l != null) {
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
            ((w9) obj).f32109b.invalidate();
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
        x9 x9Var = this.f30202m;
        if (x9Var != null) {
            synchronized (x9Var.f32439n) {
                x9Var.f32442q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f30205p;
        this.f30205p = i10 + 1;
        sb2.append(i10);
        this.f30204o = this.f30203n.f(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(vh.b8 b8Var, Object obj) {
        this.f30199j = b8Var;
        this.f30200k = obj;
        this.f30198i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.i0.L(35.0f), org.telegram.messenger.i0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f30201l = renderNode2;
            return;
        }
        this.f30201l = null;
    }
}
