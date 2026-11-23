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
public final class ba {
    public int f33707a;
    public final View f33708b;
    public final ArrayList f33709c;
    public final ArrayList d;
    public final ArrayList f33710e;
    public final Object f33711f;
    public EGLContext f33712g;
    public final Object h;
    public int f33713i;
    public hi.za f33714j;
    public Object f33715k;
    public Object f33716l;
    public ga f33717m;
    public final h2.c f33718n;
    public Bitmap f33719o;
    public int f33720p;

    public ba(View view) {
        ArrayList arrayList = new ArrayList();
        this.f33709c = arrayList;
        this.d = new ArrayList();
        this.f33710e = new ArrayList();
        this.f33711f = new Object();
        this.h = new Object();
        this.f33718n = new h2.c(0, new ng(this, 14));
        this.f33720p = 0;
        this.f33708b = view;
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
        synchronized (this.f33711f) {
            try {
                if (this.f33712g == null) {
                    this.f33712g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ga gaVar = this.f33717m;
        if (gaVar == null) {
            return this.f33719o;
        }
        synchronized (gaVar.f35386n) {
            try {
                if (!gaVar.f35389q) {
                    bitmap = null;
                } else {
                    bitmap = gaVar.f35388p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f33719o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f33716l != null) {
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
            ((fa) obj).f35065b.invalidate();
        }
        ArrayList arrayList2 = this.f33710e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ga gaVar = this.f33717m;
        if (gaVar != null) {
            synchronized (gaVar.f35386n) {
                gaVar.f35389q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f33720p;
        this.f33720p = i7 + 1;
        sb2.append(i7);
        this.f33719o = this.f33718n.s(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(hi.za zaVar, Object obj) {
        this.f33714j = zaVar;
        this.f33715k = obj;
        this.f33713i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f33716l = renderNode2;
            return;
        }
        this.f33716l = null;
    }
}
