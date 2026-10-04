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
    public int f28050a;
    public final View f28051b;
    public final ArrayList f28052c;
    public final ArrayList d;
    public final ArrayList f28053e;
    public final Object f28054f;
    public EGLContext f28055g;
    public final Object h;
    public int f28056i;
    public ci.wb f28057j;
    public Object f28058k;
    public Object f28059l;
    public qa f28060m;
    public final pa f28061n;
    public Bitmap f28062o;
    public int f28063p;

    public ka(View view) {
        ArrayList arrayList = new ArrayList();
        this.f28052c = arrayList;
        this.d = new ArrayList();
        this.f28053e = new ArrayList();
        this.f28054f = new Object();
        this.h = new Object();
        this.f28061n = new pa(0, new qg(this, 14));
        this.f28063p = 0;
        this.f28051b = view;
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
        synchronized (this.f28054f) {
            try {
                if (this.f28055g == null) {
                    this.f28055g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        qa qaVar = this.f28060m;
        if (qaVar == null) {
            return this.f28062o;
        }
        synchronized (qaVar.f29988n) {
            try {
                if (!qaVar.f29991q) {
                    bitmap = null;
                } else {
                    bitmap = qaVar.f29990p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f28062o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f28059l != null) {
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
            ((oa) obj).f29310b.invalidate();
        }
        ArrayList arrayList2 = this.f28053e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        qa qaVar = this.f28060m;
        if (qaVar != null) {
            synchronized (qaVar.f29988n) {
                qaVar.f29991q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f28063p;
        this.f28063p = i10 + 1;
        sb2.append(i10);
        this.f28062o = this.f28061n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.wb wbVar, Object obj) {
        this.f28057j = wbVar;
        this.f28058k = obj;
        this.f28056i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f28059l = renderNode2;
            return;
        }
        this.f28059l = null;
    }
}
