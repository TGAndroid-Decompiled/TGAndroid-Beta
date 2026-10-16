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
    public int f26701a;
    public final View f26702b;
    public final ArrayList f26703c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f26704f;
    public EGLContext f26705g;
    public final Object h;
    public int f26706i;
    public di.wb f26707j;
    public Object f26708k;
    public Object f26709l;
    public ra f26710m;
    public final qa f26711n;
    public Bitmap f26712o;
    public int f26713p;

    public la(View view) {
        ArrayList arrayList = new ArrayList();
        this.f26703c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f26704f = new Object();
        this.h = new Object();
        this.f26711n = new qa(0, new qg(this, 14));
        this.f26713p = 0;
        this.f26702b = view;
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
        synchronized (this.f26704f) {
            try {
                if (this.f26705g == null) {
                    this.f26705g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ra raVar = this.f26710m;
        if (raVar == null) {
            return this.f26712o;
        }
        synchronized (raVar.f28481n) {
            try {
                if (!raVar.f28484q) {
                    bitmap = null;
                } else {
                    bitmap = raVar.f28483p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f26712o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f26709l != null) {
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
            ((pa) obj).f27939b.invalidate();
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
        ra raVar = this.f26710m;
        if (raVar != null) {
            synchronized (raVar.f28481n) {
                raVar.f28484q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f26713p;
        this.f26713p = i10 + 1;
        sb2.append(i10);
        this.f26712o = this.f26711n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(di.wb wbVar, Object obj) {
        this.f26707j = wbVar;
        this.f26708k = obj;
        this.f26706i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f26709l = renderNode2;
            return;
        }
        this.f26709l = null;
    }
}
