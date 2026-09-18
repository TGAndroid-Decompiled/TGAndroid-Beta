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
    public int f25271a;
    public final View f25272b;
    public final ArrayList f25273c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f25274f;
    public EGLContext f25275g;
    public final Object h;
    public int f25276i;
    public ci.ac f25277j;
    public Object f25278k;
    public Object f25279l;
    public pa f25280m;
    public final oa f25281n;
    public Bitmap f25282o;
    public int f25283p;

    public ja(View view) {
        ArrayList arrayList = new ArrayList();
        this.f25273c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f25274f = new Object();
        this.h = new Object();
        this.f25281n = new oa(0, new og(this, 14));
        this.f25283p = 0;
        this.f25272b = view;
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
        synchronized (this.f25274f) {
            try {
                if (this.f25275g == null) {
                    this.f25275g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        pa paVar = this.f25280m;
        if (paVar == null) {
            return this.f25282o;
        }
        synchronized (paVar.f27174n) {
            try {
                if (!paVar.f27177q) {
                    bitmap = null;
                } else {
                    bitmap = paVar.f27176p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f25282o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f25279l != null) {
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
            ((na) obj).f26636b.invalidate();
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
        pa paVar = this.f25280m;
        if (paVar != null) {
            synchronized (paVar.f27174n) {
                paVar.f27177q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f25283p;
        this.f25283p = i10 + 1;
        sb2.append(i10);
        this.f25282o = this.f25281n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.ac acVar, Object obj) {
        this.f25277j = acVar;
        this.f25278k = obj;
        this.f25276i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f25279l = renderNode2;
            return;
        }
        this.f25279l = null;
    }
}
