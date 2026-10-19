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
    public int f27477a;
    public final View f27478b;
    public final ArrayList f27479c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f27480f;
    public EGLContext f27481g;
    public final Object h;
    public int f27482i;
    public ei.hb f27483j;
    public Object f27484k;
    public Object f27485l;
    public pa f27486m;
    public final oa f27487n;
    public Bitmap f27488o;
    public int f27489p;

    public ja(View view) {
        ArrayList arrayList = new ArrayList();
        this.f27479c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f27480f = new Object();
        this.h = new Object();
        this.f27487n = new oa(0, new pg(this, 14));
        this.f27489p = 0;
        this.f27478b = view;
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
        synchronized (this.f27480f) {
            try {
                if (this.f27481g == null) {
                    this.f27481g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        pa paVar = this.f27486m;
        if (paVar == null) {
            return this.f27488o;
        }
        synchronized (paVar.f29225n) {
            try {
                if (!paVar.f29228q) {
                    bitmap = null;
                } else {
                    bitmap = paVar.f29227p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f27488o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f27485l != null) {
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
            ((na) obj).f28705b.invalidate();
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
        pa paVar = this.f27486m;
        if (paVar != null) {
            synchronized (paVar.f29225n) {
                paVar.f29228q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f27489p;
        this.f27489p = i10 + 1;
        sb2.append(i10);
        this.f27488o = this.f27487n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ei.hb hbVar, Object obj) {
        this.f27483j = hbVar;
        this.f27484k = obj;
        this.f27482i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f27485l = renderNode2;
            return;
        }
        this.f27485l = null;
    }
}
