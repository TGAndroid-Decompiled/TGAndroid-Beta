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
import org.telegram.messenger.AndroidUtilities;
public final class ja {
    public int f27434a;
    public final View f27435b;
    public final ArrayList f27436c;
    public final ArrayList d;
    public final ArrayList f27437e;
    public final Object f27438f;
    public EGLContext f27439g;
    public final Object h;
    public int f27440i;
    public di.bc f27441j;
    public Object f27442k;
    public Object f27443l;
    public pa f27444m;
    public final oa f27445n;
    public Bitmap f27446o;
    public int f27447p;

    public ja(View view) {
        ArrayList arrayList = new ArrayList();
        this.f27436c = arrayList;
        this.d = new ArrayList();
        this.f27437e = new ArrayList();
        this.f27438f = new Object();
        this.h = new Object();
        this.f27445n = new oa(0, new pg(this, 14));
        this.f27447p = 0;
        this.f27435b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new bi.i2(this, 4));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f27438f) {
            try {
                if (this.f27439g == null) {
                    this.f27439g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        pa paVar = this.f27444m;
        if (paVar == null) {
            return this.f27446o;
        }
        synchronized (paVar.f29362n) {
            try {
                if (!paVar.f29365q) {
                    bitmap = null;
                } else {
                    bitmap = paVar.f29364p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f27446o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f27443l != null) {
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
            ((na) obj).f28730b.invalidate();
        }
        ArrayList arrayList2 = this.f27437e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        pa paVar = this.f27444m;
        if (paVar != null) {
            synchronized (paVar.f29362n) {
                paVar.f29365q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f27447p;
        this.f27447p = i10 + 1;
        sb2.append(i10);
        this.f27446o = this.f27445n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(di.bc bcVar, Object obj) {
        this.f27441j = bcVar;
        this.f27442k = obj;
        this.f27440i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f27443l = renderNode2;
            return;
        }
        this.f27443l = null;
    }
}
