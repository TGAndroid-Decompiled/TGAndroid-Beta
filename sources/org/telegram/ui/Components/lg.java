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
public abstract class lg extends mt {
    public tc f37123e2;
    public final ChatActivityEnterView f37124f2;

    public lg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f37124f2 = chatActivityEnterView;
    }

    @Override
    public final void E() {
        mg mgVar = this.f37124f2.P3;
        if (mgVar != null) {
            mgVar.h2();
        }
    }

    @Override
    public final void F() {
        mg mgVar = this.f37124f2.P3;
        if (mgVar != null) {
            mgVar.f();
        }
    }

    public final void J(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.bn bnVar = this.f37124f2.F3;
        if (bnVar != null && bnVar.y()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.f22877e.c(new org.telegram.ui.Cells.fa(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z10), 5));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f37124f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null && bnVar.getParentActivity() != null) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(0);
            if (chatActivityEnterView.f32755p3) {
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.h3(new a9.h(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.p1().J2(null, bnVar, chatActivityEnterView.M4);
            PhotoViewer.p1().g2(arrayList, 0, 2, false, new kg(this, efVar, file), chatActivityEnterView.F3);
        }
    }

    public final void L(org.telegram.ui.Cells.aa aaVar, boolean z10, int i7, int i10) {
        org.telegram.messenger.fj threadMessage;
        org.telegram.messenger.fj threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f37124f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        org.telegram.ui.dg0 dg0Var = chatActivityEnterView.M0;
        org.telegram.messenger.bw bwVar = null;
        if (dg0Var != null) {
            dg0Var.h(true);
            chatActivityEnterView.M0 = null;
        }
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && bnVar != null && rmVar.f51750f) {
            bnVar.yc();
            return;
        }
        t0.h hVar = (t0.h) aaVar.f30491b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.S;
            Uri b10 = hVar.b();
            long j3 = chatActivityEnterView.G3;
            org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.rm rmVar2 = chatActivityEnterView.L3;
            if (bnVar != null) {
                bwVar = bnVar.Y8();
            }
            org.telegram.messenger.zy.T(cVar, null, null, b10, null, "image/gif", j3, fjVar, threadMessage2, null, rmVar2, z10, aaVar, bwVar);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.S;
            Uri b11 = hVar.b();
            long j10 = chatActivityEnterView.G3;
            org.telegram.messenger.fj fjVar2 = chatActivityEnterView.J3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (bnVar != null) {
                bwVar = bnVar.Y8();
            }
            org.telegram.messenger.zy.Y(cVar2, b11, j10, fjVar2, threadMessage, aaVar, null, z10, 0, bwVar);
        }
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.G(null, true, i7, i10, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourcesProvider() {
        return this.f37124f2.M4;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f37124f2;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            bnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.C0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f37124f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i7 = ChatActivityEnterView.f32633s7;
            if (chatActivityEnterView.R2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f32759p7) {
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
        ChatActivityEnterView chatActivityEnterView = this.f37124f2;
        chatActivityEnterView.T = z10;
        super.onMeasure(i7, i10);
        if (chatActivityEnterView.T) {
            chatActivityEnterView.U = getLineCount();
            if (chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.V1(z11);
            if (chatActivityEnterView.U <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z12 = false;
            }
            chatActivityEnterView.b2(z12);
        }
        chatActivityEnterView.T = false;
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        mg mgVar = this.f37124f2.P3;
        if (mgVar != null) {
            mgVar.V();
        }
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        boolean z10;
        x60 x60Var;
        hf hfVar;
        super.onSelectionChanged(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f37124f2;
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.E();
        }
        ge geVar = chatActivityEnterView.R0;
        if (geVar != null) {
            if (chatActivityEnterView.F3 != null && (hfVar = chatActivityEnterView.F0) != null && hfVar.getSelectionEnd() != chatActivityEnterView.F0.getSelectionStart()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (geVar.f42850x != z10) {
                geVar.f42850x = z10;
                geVar.invalidate();
            }
            if (!z10 && (x60Var = chatActivityEnterView.V6) != null) {
                x60Var.v();
                chatActivityEnterView.V6 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f37124f2;
            chatActivityEnterView.N2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.R2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f37124f2;
        if (!chatActivityEnterView.f32794u4 && chatActivityEnterView.f32773r4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.R0()) {
                if (this.f37123e2 == null) {
                    tc tcVar = new tc(this);
                    this.f37123e2 = tcVar;
                    tcVar.h = new Runnable(this) {
                        public final lg f36410b;

                        {
                            this.f36410b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            lg lgVar = this.f36410b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = lgVar.f37124f2;
                                    int i11 = ChatActivityEnterView.f32633s7;
                                    chatActivityEnterView2.a2();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = lgVar.f37124f2;
                                    chatActivityEnterView3.f32648b4 = false;
                                    chatActivityEnterView3.k1();
                                    return;
                            }
                        }
                    };
                }
                tc tcVar2 = this.f37123e2;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                tcVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                tcVar2.f39899i = false;
                tcVar2.f39895c = 0;
                tcVar2.a(rectF);
                return this.f37123e2.b(motionEvent);
            } else if (chatActivityEnterView.T0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.R1(0, false);
                    chatActivityEnterView.V0.t(false);
                    requestFocus();
                }
                if (org.telegram.messenger.g0.D) {
                    i7 = 0;
                } else {
                    i7 = 2;
                }
                chatActivityEnterView.Z1(i7, 0, true, true);
                if (chatActivityEnterView.f32756p4) {
                    chatActivityEnterView.S1(false, true, false, true);
                    chatActivityEnterView.f32648b4 = true;
                    org.telegram.messenger.g0.h3(new Runnable(this) {
                        public final lg f36410b;

                        {
                            this.f36410b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            lg lgVar = this.f36410b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = lgVar.f37124f2;
                                    int i11 = ChatActivityEnterView.f32633s7;
                                    chatActivityEnterView2.a2();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = lgVar.f37124f2;
                                    chatActivityEnterView3.f32648b4 = false;
                                    chatActivityEnterView3.k1();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.k1();
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
        ChatActivityEnterView chatActivityEnterView = this.f37124f2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.R0()) {
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
        ChatActivityEnterView chatActivityEnterView = this.f37124f2;
        if (chatActivityEnterView.f32655c2.getForeground() != null) {
            cu0 cu0Var = chatActivityEnterView.f32655c2;
            cu0Var.invalidateDrawable(cu0Var.getForeground());
        }
    }
}
