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
    public int f24609a;
    public final View f24610b;
    public final ArrayList f24611c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f24612f;
    public EGLContext f24613g;
    public final Object h;
    public int f24614i;
    public ci.ac f24615j;
    public Object f24616k;
    public Object f24617l;
    public na f24618m;
    public final ma f24619n;
    public Bitmap f24620o;
    public int f24621p;

    public ha(View view) {
        ArrayList arrayList = new ArrayList();
        this.f24611c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f24612f = new Object();
        this.h = new Object();
        this.f24619n = new ma(0, new ng(this, 14));
        this.f24621p = 0;
        this.f24610b = view;
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
        synchronized (this.f24612f) {
            try {
                if (this.f24613g == null) {
                    this.f24613g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        na naVar = this.f24618m;
        if (naVar == null) {
            return this.f24620o;
        }
        synchronized (naVar.f26419n) {
            try {
                if (!naVar.f26422q) {
                    bitmap = null;
                } else {
                    bitmap = naVar.f26421p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f24620o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f24617l != null) {
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
            ((la) obj).f25871b.invalidate();
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
        na naVar = this.f24618m;
        if (naVar != null) {
            synchronized (naVar.f26419n) {
                naVar.f26422q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f24621p;
        this.f24621p = i10 + 1;
        sb2.append(i10);
        this.f24620o = this.f24619n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.ac acVar, Object obj) {
        this.f24615j = acVar;
        this.f24616k = obj;
        this.f24614i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f24617l = renderNode2;
            return;
        }
        this.f24617l = null;
    }
}
