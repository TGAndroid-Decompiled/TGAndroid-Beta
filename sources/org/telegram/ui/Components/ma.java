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
public final class ma {
    public int f28737a;
    public final View f28738b;
    public final ArrayList f28739c;
    public final ArrayList d;
    public final ArrayList f28740e;
    public final Object f28741f;
    public EGLContext f28742g;
    public final Object h;
    public int f28743i;
    public ci.xb f28744j;
    public Object f28745k;
    public Object f28746l;
    public sa f28747m;
    public final ra f28748n;
    public Bitmap f28749o;
    public int f28750p;

    public ma(View view) {
        ArrayList arrayList = new ArrayList();
        this.f28739c = arrayList;
        this.d = new ArrayList();
        this.f28740e = new ArrayList();
        this.f28741f = new Object();
        this.h = new Object();
        this.f28748n = new ra(0, new rg(this, 14));
        this.f28750p = 0;
        this.f28738b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.v2(this, 5));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f28741f) {
            try {
                if (this.f28742g == null) {
                    this.f28742g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        sa saVar = this.f28747m;
        if (saVar == null) {
            return this.f28749o;
        }
        synchronized (saVar.f30735n) {
            try {
                if (!saVar.f30738q) {
                    bitmap = null;
                } else {
                    bitmap = saVar.f30737p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f28749o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f28746l != null) {
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
            ((qa) obj).f30142b.invalidate();
        }
        ArrayList arrayList2 = this.f28740e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        sa saVar = this.f28747m;
        if (saVar != null) {
            synchronized (saVar.f30735n) {
                saVar.f30738q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f28750p;
        this.f28750p = i10 + 1;
        sb2.append(i10);
        this.f28749o = this.f28748n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.xb xbVar, Object obj) {
        this.f28744j = xbVar;
        this.f28745k = obj;
        this.f28743i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f28746l = renderNode2;
            return;
        }
        this.f28746l = null;
    }
}
