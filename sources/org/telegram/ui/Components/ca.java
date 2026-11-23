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
    public int f34125a;
    public final View f34126b;
    public final ArrayList f34127c;
    public final ArrayList d;
    public final ArrayList f34128e;
    public final Object f34129f;
    public EGLContext f34130g;
    public final Object h;
    public int f34131i;
    public hi.ea f34132j;
    public Object f34133k;
    public Object f34134l;
    public ha f34135m;
    public final h2.c f34136n;
    public Bitmap f34137o;
    public int f34138p;

    public ca(View view) {
        ArrayList arrayList = new ArrayList();
        this.f34127c = arrayList;
        this.d = new ArrayList();
        this.f34128e = new ArrayList();
        this.f34129f = new Object();
        this.h = new Object();
        this.f34136n = new h2.c(0, new og(this, 14));
        this.f34138p = 0;
        this.f34126b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new bi.v2(this, 11));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f34129f) {
            try {
                if (this.f34130g == null) {
                    this.f34130g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ha haVar = this.f34135m;
        if (haVar == null) {
            return this.f34137o;
        }
        synchronized (haVar.f35850n) {
            try {
                if (!haVar.f35853q) {
                    bitmap = null;
                } else {
                    bitmap = haVar.f35852p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f34137o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f34134l != null) {
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
            ((ga) obj).f35488b.invalidate();
        }
        ArrayList arrayList2 = this.f34128e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ha haVar = this.f34135m;
        if (haVar != null) {
            synchronized (haVar.f35850n) {
                haVar.f35853q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f34138p;
        this.f34138p = i7 + 1;
        sb2.append(i7);
        this.f34137o = this.f34136n.s(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(hi.ea eaVar, Object obj) {
        this.f34132j = eaVar;
        this.f34133k = obj;
        this.f34131i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f34134l = renderNode2;
            return;
        }
        this.f34134l = null;
    }
}
