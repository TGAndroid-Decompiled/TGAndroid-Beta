package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public abstract class jg extends mt {
    public tc f36430e2;
    public final ChatActivityEnterView f36431f2;

    public jg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f36431f2 = chatActivityEnterView;
    }

    @Override
    public final void E() {
        kg kgVar = this.f36431f2.N3;
        if (kgVar != null) {
            kgVar.i2();
        }
    }

    @Override
    public final void F() {
        kg kgVar = this.f36431f2.N3;
        if (kgVar != null) {
            kgVar.g();
        }
    }

    public final void J(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.bn bnVar = this.f36431f2.D3;
        if (bnVar != null && bnVar.z()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.f22782e.c(new k7(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z10), 3));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f36431f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null && bnVar.getParentActivity() != null) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(0);
            if (chatActivityEnterView.f32645n3) {
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.h3(new a9.h(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.p1().I2(null, bnVar, chatActivityEnterView.K4);
            PhotoViewer.p1().f2(arrayList, 0, 2, false, new ig(this, efVar, file), chatActivityEnterView.D3);
        }
    }

    public final void L(of ofVar, boolean z10, int i7, int i10) {
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.fj threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f36431f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
        org.telegram.messenger.bw bwVar = null;
        if (eg0Var != null) {
            eg0Var.h(true);
            chatActivityEnterView.M0 = null;
        }
        org.telegram.ui.rm rmVar = chatActivityEnterView.J3;
        if (rmVar != null && bnVar != null && rmVar.f51655f) {
            bnVar.yc();
            return;
        }
        t0.h hVar = (t0.h) ofVar.f38076b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.S;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.E3;
            org.telegram.messenger.fj fjVar = chatActivityEnterView.H3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.rm rmVar2 = chatActivityEnterView.J3;
            if (bnVar != null) {
                bwVar = bnVar.Y8();
            }
            org.telegram.messenger.zy.T(cVar, null, null, c10, null, "image/gif", j3, fjVar, threadMessage2, null, rmVar2, z10, ofVar, bwVar);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.S;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.E3;
            org.telegram.messenger.fj fjVar2 = chatActivityEnterView.H3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (bnVar != null) {
                bwVar = bnVar.Y8();
            }
            org.telegram.messenger.zy.Y(cVar2, c11, j10, fjVar2, threadMessage, ofVar, null, z10, 0, bwVar);
        }
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.H(null, true, i7, i10, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jg.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourcesProvider() {
        return this.f36431f2.K4;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f36431f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null) {
            bnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.y0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f36431f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i7 = ChatActivityEnterView.f32538n7;
            if (chatActivityEnterView.P2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f32627k7) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new b0(this, 17));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new b0(this, 17));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.f36431f2;
        chatActivityEnterView.T = z10;
        super.onMeasure(i7, i10);
        if (chatActivityEnterView.T) {
            chatActivityEnterView.U = getLineCount();
            if (chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.P1(z11);
            if (chatActivityEnterView.U <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z12 = false;
            }
            chatActivityEnterView.V1(z12);
        }
        chatActivityEnterView.T = false;
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        kg kgVar = this.f36431f2.N3;
        if (kgVar != null) {
            kgVar.b0();
        }
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        boolean z10;
        y60 y60Var;
        gf gfVar;
        super.onSelectionChanged(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f36431f2;
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.G();
        }
        fe feVar = chatActivityEnterView.R0;
        if (feVar != null) {
            if (chatActivityEnterView.D3 != null && (gfVar = chatActivityEnterView.F0) != null && gfVar.getSelectionEnd() != chatActivityEnterView.F0.getSelectionStart()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (feVar.f42488x != z10) {
                feVar.f42488x = z10;
                feVar.invalidate();
            }
            if (!z10 && (y60Var = chatActivityEnterView.T6) != null) {
                y60Var.v();
                chatActivityEnterView.T6 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f36431f2;
            chatActivityEnterView.L2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.P2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f36431f2;
        if (!chatActivityEnterView.f32682s4 && chatActivityEnterView.f32659p4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.M0()) {
                if (this.f36430e2 == null) {
                    tc tcVar = new tc(this);
                    this.f36430e2 = tcVar;
                    tcVar.h = new Runnable(this) {
                        public final jg f35859b;

                        {
                            this.f35859b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            jg jgVar = this.f35859b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = jgVar.f36431f2;
                                    int i11 = ChatActivityEnterView.f32538n7;
                                    chatActivityEnterView2.U1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = jgVar.f36431f2;
                                    chatActivityEnterView3.Z3 = false;
                                    chatActivityEnterView3.f1();
                                    return;
                            }
                        }
                    };
                }
                tc tcVar2 = this.f36430e2;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                tcVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                tcVar2.f39973i = false;
                tcVar2.f39969c = 0;
                tcVar2.a(rectF);
                return this.f36430e2.b(motionEvent);
            } else if (chatActivityEnterView.O0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.F2 != 0) {
                    chatActivityEnterView.L1(0, false);
                    chatActivityEnterView.V0.t(false);
                    requestFocus();
                }
                if (org.telegram.messenger.g0.D) {
                    i7 = 0;
                } else {
                    i7 = 2;
                }
                chatActivityEnterView.T1(i7, 0, true, true);
                if (chatActivityEnterView.f32646n4) {
                    chatActivityEnterView.M1(false, true, false, true);
                    chatActivityEnterView.Z3 = true;
                    org.telegram.messenger.g0.h3(new Runnable(this) {
                        public final jg f35859b;

                        {
                            this.f35859b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            jg jgVar = this.f35859b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = jgVar.f36431f2;
                                    int i11 = ChatActivityEnterView.f32538n7;
                                    chatActivityEnterView2.U1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = jgVar.f36431f2;
                                    chatActivityEnterView3.Z3 = false;
                                    chatActivityEnterView3.f1();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.f1();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i7, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.f36431f2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.M0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i7, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.g0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f36431f2;
        if (chatActivityEnterView.f32542a2.getForeground() != null) {
            au0 au0Var = chatActivityEnterView.f32542a2;
            au0Var.invalidateDrawable(au0Var.getForeground());
        }
    }
}
