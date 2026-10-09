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
    public int f28787a;
    public final View f28788b;
    public final ArrayList f28789c;
    public final ArrayList d;
    public final ArrayList f28790e;
    public final Object f28791f;
    public EGLContext f28792g;
    public final Object h;
    public int f28793i;
    public ci.xb f28794j;
    public Object f28795k;
    public Object f28796l;
    public sa f28797m;
    public final ra f28798n;
    public Bitmap f28799o;
    public int f28800p;

    public ma(View view) {
        ArrayList arrayList = new ArrayList();
        this.f28789c = arrayList;
        this.d = new ArrayList();
        this.f28790e = new ArrayList();
        this.f28791f = new Object();
        this.h = new Object();
        this.f28798n = new ra(0, new rg(this, 14));
        this.f28800p = 0;
        this.f28788b = view;
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
        synchronized (this.f28791f) {
            try {
                if (this.f28792g == null) {
                    this.f28792g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        sa saVar = this.f28797m;
        if (saVar == null) {
            return this.f28799o;
        }
        synchronized (saVar.f30751n) {
            try {
                if (!saVar.f30754q) {
                    bitmap = null;
                } else {
                    bitmap = saVar.f30753p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f28799o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f28796l != null) {
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
            ((qa) obj).f30118b.invalidate();
        }
        ArrayList arrayList2 = this.f28790e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        sa saVar = this.f28797m;
        if (saVar != null) {
            synchronized (saVar.f30751n) {
                saVar.f30754q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f28800p;
        this.f28800p = i10 + 1;
        sb2.append(i10);
        this.f28799o = this.f28798n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.xb xbVar, Object obj) {
        this.f28794j = xbVar;
        this.f28795k = obj;
        this.f28793i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f28796l = renderNode2;
            return;
        }
        this.f28796l = null;
    }
}
