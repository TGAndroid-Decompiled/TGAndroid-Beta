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
    public int f40258a;
    public final View f40259b;
    public final ArrayList f40260c;
    public final ArrayList d;
    public final ArrayList f40261e;
    public final Object f40262f;
    public EGLContext f40263g;
    public final Object h;
    public int f40264i;
    public fi.ha f40265j;
    public Object f40266k;
    public Object f40267l;
    public ca f40268m;
    public final h2.c f40269n;
    public Bitmap f40270o;
    public int f40271p;

    public x9(View view) {
        ArrayList arrayList = new ArrayList();
        this.f40260c = arrayList;
        this.d = new ArrayList();
        this.f40261e = new ArrayList();
        this.f40262f = new Object();
        this.h = new Object();
        this.f40269n = new h2.c(0, new wf(this, 14));
        this.f40271p = 0;
        this.f40259b = view;
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
        synchronized (this.f40262f) {
            try {
                if (this.f40263g == null) {
                    this.f40263g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ca caVar = this.f40268m;
        if (caVar == null) {
            return this.f40270o;
        }
        synchronized (caVar.f32511n) {
            try {
                if (!caVar.f32514q) {
                    bitmap = null;
                } else {
                    bitmap = caVar.f32513p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f40270o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f40267l != null) {
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
            ((ba) obj).f32175b.invalidate();
        }
        ArrayList arrayList2 = this.f40261e;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ca caVar = this.f40268m;
        if (caVar != null) {
            synchronized (caVar.f32511n) {
                caVar.f32514q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z9) {
        StringBuilder sb2 = new StringBuilder("");
        int i7 = this.f40271p;
        this.f40271p = i7 + 1;
        sb2.append(i7);
        this.f40270o = this.f40269n.s(bitmap, sb2.toString(), 0, 0, z9);
    }

    public final void g(fi.ha haVar, Object obj) {
        this.f40265j = haVar;
        this.f40266k = obj;
        this.f40264i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f40267l = renderNode2;
            return;
        }
        this.f40267l = null;
    }
}
