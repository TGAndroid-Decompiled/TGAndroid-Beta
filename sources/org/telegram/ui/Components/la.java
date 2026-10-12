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
public final class la {
    public int f27001a;
    public final View f27002b;
    public final ArrayList f27003c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f27004f;
    public EGLContext f27005g;
    public final Object h;
    public int f27006i;
    public di.wb f27007j;
    public Object f27008k;
    public Object f27009l;
    public ra f27010m;
    public final qa f27011n;
    public Bitmap f27012o;
    public int f27013p;

    public la(View view) {
        ArrayList arrayList = new ArrayList();
        this.f27003c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f27004f = new Object();
        this.h = new Object();
        this.f27011n = new qa(0, new qg(this, 14));
        this.f27013p = 0;
        this.f27002b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new bi.j2(this, 5));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f27004f) {
            try {
                if (this.f27005g == null) {
                    this.f27005g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ra raVar = this.f27010m;
        if (raVar == null) {
            return this.f27012o;
        }
        synchronized (raVar.f28791n) {
            try {
                if (!raVar.f28794q) {
                    bitmap = null;
                } else {
                    bitmap = raVar.f28793p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f27012o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f27009l != null) {
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
            ((pa) obj).f28258b.invalidate();
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
        ra raVar = this.f27010m;
        if (raVar != null) {
            synchronized (raVar.f28791n) {
                raVar.f28794q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f27013p;
        this.f27013p = i10 + 1;
        sb2.append(i10);
        this.f27012o = this.f27011n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(di.wb wbVar, Object obj) {
        this.f27007j = wbVar;
        this.f27008k = obj;
        this.f27006i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f27009l = renderNode2;
            return;
        }
        this.f27009l = null;
    }
}
