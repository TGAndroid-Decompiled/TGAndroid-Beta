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
    public int f27408a;
    public final View f27409b;
    public final ArrayList f27410c;
    public final ArrayList d;
    public final ArrayList f27411e;
    public final Object f27412f;
    public EGLContext f27413g;
    public final Object h;
    public int f27414i;
    public di.bc f27415j;
    public Object f27416k;
    public Object f27417l;
    public pa f27418m;
    public final oa f27419n;
    public Bitmap f27420o;
    public int f27421p;

    public ja(View view) {
        ArrayList arrayList = new ArrayList();
        this.f27410c = arrayList;
        this.d = new ArrayList();
        this.f27411e = new ArrayList();
        this.f27412f = new Object();
        this.h = new Object();
        this.f27419n = new oa(0, new pg(this, 14));
        this.f27421p = 0;
        this.f27409b = view;
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
        synchronized (this.f27412f) {
            try {
                if (this.f27413g == null) {
                    this.f27413g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        pa paVar = this.f27418m;
        if (paVar == null) {
            return this.f27420o;
        }
        synchronized (paVar.f29336n) {
            try {
                if (!paVar.f29339q) {
                    bitmap = null;
                } else {
                    bitmap = paVar.f29338p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f27420o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f27417l != null) {
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
            ((na) obj).f28704b.invalidate();
        }
        ArrayList arrayList2 = this.f27411e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        pa paVar = this.f27418m;
        if (paVar != null) {
            synchronized (paVar.f29336n) {
                paVar.f29339q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f27421p;
        this.f27421p = i10 + 1;
        sb2.append(i10);
        this.f27420o = this.f27419n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(di.bc bcVar, Object obj) {
        this.f27415j = bcVar;
        this.f27416k = obj;
        this.f27414i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f27417l = renderNode2;
            return;
        }
        this.f27417l = null;
    }
}
