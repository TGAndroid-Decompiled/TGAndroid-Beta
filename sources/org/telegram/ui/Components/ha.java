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
public final class ha {
    public int f26974a;
    public final View f26975b;
    public final ArrayList f26976c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f26977f;
    public EGLContext f26978g;
    public final Object h;
    public int f26979i;
    public ei.hb f26980j;
    public Object f26981k;
    public Object f26982l;
    public na f26983m;
    public final ma f26984n;
    public Bitmap f26985o;
    public int f26986p;

    public ha(View view) {
        ArrayList arrayList = new ArrayList();
        this.f26976c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f26977f = new Object();
        this.h = new Object();
        this.f26984n = new ma(0, new ng(this, 15));
        this.f26986p = 0;
        this.f26975b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.n6(this, 6));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f26977f) {
            try {
                if (this.f26978g == null) {
                    this.f26978g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        na naVar = this.f26983m;
        if (naVar == null) {
            return this.f26985o;
        }
        synchronized (naVar.f28844n) {
            try {
                if (!naVar.f28847q) {
                    bitmap = null;
                } else {
                    bitmap = naVar.f28846p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f26985o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f26982l != null) {
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
            ((la) obj).f28291b.invalidate();
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
        na naVar = this.f26983m;
        if (naVar != null) {
            synchronized (naVar.f28844n) {
                naVar.f28847q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f26986p;
        this.f26986p = i10 + 1;
        sb2.append(i10);
        this.f26985o = this.f26984n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ei.hb hbVar, Object obj) {
        this.f26980j = hbVar;
        this.f26981k = obj;
        this.f26979i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f26982l = renderNode2;
            return;
        }
        this.f26982l = null;
    }
}
