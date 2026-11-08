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
    public int f40625a;
    public final View f40626b;
    public final ArrayList f40627c;
    public final ArrayList d;
    public final ArrayList f40628e;
    public final Object f40629f;
    public EGLContext f40630g;
    public final Object h;
    public int f40631i;
    public fi.ha f40632j;
    public Object f40633k;
    public Object f40634l;
    public da f40635m;
    public final h2.c f40636n;
    public Bitmap f40637o;
    public int f40638p;

    public y9(View view) {
        ArrayList arrayList = new ArrayList();
        this.f40627c = arrayList;
        this.d = new ArrayList();
        this.f40628e = new ArrayList();
        this.f40629f = new Object();
        this.h = new Object();
        this.f40636n = new h2.c(0, new xf(this, 14));
        this.f40638p = 0;
        this.f40626b = view;
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
        synchronized (this.f40629f) {
            try {
                if (this.f40630g == null) {
                    this.f40630g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        da daVar = this.f40635m;
        if (daVar == null) {
            return this.f40637o;
        }
        synchronized (daVar.f32848n) {
            try {
                if (!daVar.f32851q) {
                    bitmap = null;
                } else {
                    bitmap = daVar.f32850p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f40637o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f40634l != null) {
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
            ((ca) obj).f32502b.invalidate();
        }
        ArrayList arrayList2 = this.f40628e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        da daVar = this.f40635m;
        if (daVar != null) {
            synchronized (daVar.f32848n) {
                daVar.f32851q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z9) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f40638p;
        this.f40638p = i7 + 1;
        sb2.append(i7);
        this.f40637o = this.f40636n.s(bitmap, sb2.toString(), 0, 0, z9);
    }

    public final void g(fi.ha haVar, Object obj) {
        this.f40632j = haVar;
        this.f40633k = obj;
        this.f40631i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f40634l = renderNode2;
            return;
        }
        this.f40634l = null;
    }
}
