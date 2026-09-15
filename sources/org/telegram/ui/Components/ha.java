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
    public int f24642a;
    public final View f24643b;
    public final ArrayList f24644c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f24645f;
    public EGLContext f24646g;
    public final Object h;
    public int f24647i;
    public ci.ac f24648j;
    public Object f24649k;
    public Object f24650l;
    public na f24651m;
    public final ma f24652n;
    public Bitmap f24653o;
    public int f24654p;

    public ha(View view) {
        ArrayList arrayList = new ArrayList();
        this.f24644c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f24645f = new Object();
        this.h = new Object();
        this.f24652n = new ma(0, new ng(this, 14));
        this.f24654p = 0;
        this.f24643b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.u2(this, 4));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f24645f) {
            try {
                if (this.f24646g == null) {
                    this.f24646g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        na naVar = this.f24651m;
        if (naVar == null) {
            return this.f24653o;
        }
        synchronized (naVar.f26414n) {
            try {
                if (!naVar.f26417q) {
                    bitmap = null;
                } else {
                    bitmap = naVar.f26416p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f24653o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f24650l != null) {
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
            ((la) obj).f25883b.invalidate();
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
        na naVar = this.f24651m;
        if (naVar != null) {
            synchronized (naVar.f26414n) {
                naVar.f26417q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f24654p;
        this.f24654p = i10 + 1;
        sb2.append(i10);
        this.f24653o = this.f24652n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.ac acVar, Object obj) {
        this.f24648j = acVar;
        this.f24649k = obj;
        this.f24647i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f24650l = renderNode2;
            return;
        }
        this.f24650l = null;
    }
}
