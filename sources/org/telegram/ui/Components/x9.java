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
public final class x9 {
    public int f40271a;
    public final View f40272b;
    public final ArrayList f40273c;
    public final ArrayList d;
    public final ArrayList f40274e;
    public final Object f40275f;
    public EGLContext f40276g;
    public final Object h;
    public int f40277i;
    public gi.ha f40278j;
    public Object f40279k;
    public Object f40280l;
    public ca f40281m;
    public final g2.d f40282n;
    public Bitmap f40283o;
    public int f40284p;

    public x9(View view) {
        ArrayList arrayList = new ArrayList();
        this.f40273c = arrayList;
        this.d = new ArrayList();
        this.f40274e = new ArrayList();
        this.f40275f = new Object();
        this.h = new Object();
        this.f40282n = new g2.d(0, new vf(this, 14));
        this.f40284p = 0;
        this.f40272b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.f2(this, 11));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f40275f) {
            try {
                if (this.f40276g == null) {
                    this.f40276g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ca caVar = this.f40281m;
        if (caVar == null) {
            return this.f40283o;
        }
        synchronized (caVar.f32632n) {
            try {
                if (!caVar.f32635q) {
                    bitmap = null;
                } else {
                    bitmap = caVar.f32634p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f40283o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f40280l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ba) obj).f32125b.invalidate();
        }
        ArrayList arrayList2 = this.f40274e;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ca caVar = this.f40281m;
        if (caVar != null) {
            synchronized (caVar.f32632n) {
                caVar.f32635q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i3 = this.f40284p;
        this.f40284p = i3 + 1;
        sb2.append(i3);
        this.f40283o = this.f40282n.s(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(gi.ha haVar, Object obj) {
        this.f40278j = haVar;
        this.f40279k = obj;
        this.f40277i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f40280l = renderNode2;
            return;
        }
        this.f40280l = null;
    }
}
