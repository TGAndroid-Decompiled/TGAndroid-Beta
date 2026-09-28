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
    public int f25411a;
    public final View f25412b;
    public final ArrayList f25413c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f25414f;
    public EGLContext f25415g;
    public final Object h;
    public int f25416i;
    public ci.xb f25417j;
    public Object f25418k;
    public Object f25419l;
    public pa f25420m;
    public final oa f25421n;
    public Bitmap f25422o;
    public int f25423p;

    public ja(View view) {
        ArrayList arrayList = new ArrayList();
        this.f25413c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f25414f = new Object();
        this.h = new Object();
        this.f25421n = new oa(0, new pg(this, 14));
        this.f25423p = 0;
        this.f25412b = view;
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
        synchronized (this.f25414f) {
            try {
                if (this.f25415g == null) {
                    this.f25415g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        pa paVar = this.f25420m;
        if (paVar == null) {
            return this.f25422o;
        }
        synchronized (paVar.f27312n) {
            try {
                if (!paVar.f27315q) {
                    bitmap = null;
                } else {
                    bitmap = paVar.f27314p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f25422o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f25419l != null) {
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
            ((na) obj).f26714b.invalidate();
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
        pa paVar = this.f25420m;
        if (paVar != null) {
            synchronized (paVar.f27312n) {
                paVar.f27315q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f25423p;
        this.f25423p = i10 + 1;
        sb2.append(i10);
        this.f25422o = this.f25421n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.xb xbVar, Object obj) {
        this.f25417j = xbVar;
        this.f25418k = obj;
        this.f25416i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f25419l = renderNode2;
            return;
        }
        this.f25419l = null;
    }
}
