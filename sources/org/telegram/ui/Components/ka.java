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
public final class ka {
    public int f28136a;
    public final View f28137b;
    public final ArrayList f28138c;
    public final ArrayList d;
    public final ArrayList f28139e;
    public final Object f28140f;
    public EGLContext f28141g;
    public final Object h;
    public int f28142i;
    public ci.wb f28143j;
    public Object f28144k;
    public Object f28145l;
    public qa f28146m;
    public final pa f28147n;
    public Bitmap f28148o;
    public int f28149p;

    public ka(View view) {
        ArrayList arrayList = new ArrayList();
        this.f28138c = arrayList;
        this.d = new ArrayList();
        this.f28139e = new ArrayList();
        this.f28140f = new Object();
        this.h = new Object();
        this.f28147n = new pa(0, new qg(this, 14));
        this.f28149p = 0;
        this.f28137b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.u2(this, 5));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f28140f) {
            try {
                if (this.f28141g == null) {
                    this.f28141g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        qa qaVar = this.f28146m;
        if (qaVar == null) {
            return this.f28148o;
        }
        synchronized (qaVar.f30010n) {
            try {
                if (!qaVar.f30013q) {
                    bitmap = null;
                } else {
                    bitmap = qaVar.f30012p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f28148o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f28145l != null) {
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
            ((oa) obj).f29410b.invalidate();
        }
        ArrayList arrayList2 = this.f28139e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        qa qaVar = this.f28146m;
        if (qaVar != null) {
            synchronized (qaVar.f30010n) {
                qaVar.f30013q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f28149p;
        this.f28149p = i10 + 1;
        sb2.append(i10);
        this.f28148o = this.f28147n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.wb wbVar, Object obj) {
        this.f28143j = wbVar;
        this.f28144k = obj;
        this.f28142i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f28145l = renderNode2;
            return;
        }
        this.f28145l = null;
    }
}
