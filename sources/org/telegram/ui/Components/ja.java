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
    public int f25365a;
    public final View f25366b;
    public final ArrayList f25367c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f25368f;
    public EGLContext f25369g;
    public final Object h;
    public int f25370i;
    public ci.xb f25371j;
    public Object f25372k;
    public Object f25373l;
    public pa f25374m;
    public final oa f25375n;
    public Bitmap f25376o;
    public int f25377p;

    public ja(View view) {
        ArrayList arrayList = new ArrayList();
        this.f25367c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f25368f = new Object();
        this.h = new Object();
        this.f25375n = new oa(0, new pg(this, 14));
        this.f25377p = 0;
        this.f25366b = view;
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
        synchronized (this.f25368f) {
            try {
                if (this.f25369g == null) {
                    this.f25369g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        pa paVar = this.f25374m;
        if (paVar == null) {
            return this.f25376o;
        }
        synchronized (paVar.f27305n) {
            try {
                if (!paVar.f27308q) {
                    bitmap = null;
                } else {
                    bitmap = paVar.f27307p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f25376o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f25373l != null) {
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
            ((na) obj).f26688b.invalidate();
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
        pa paVar = this.f25374m;
        if (paVar != null) {
            synchronized (paVar.f27305n) {
                paVar.f27308q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f25377p;
        this.f25377p = i10 + 1;
        sb2.append(i10);
        this.f25376o = this.f25375n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.xb xbVar, Object obj) {
        this.f25371j = xbVar;
        this.f25372k = obj;
        this.f25370i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f25373l = renderNode2;
            return;
        }
        this.f25373l = null;
    }
}
