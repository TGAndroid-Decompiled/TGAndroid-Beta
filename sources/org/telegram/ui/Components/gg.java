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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public abstract class gg extends st {
    public ad f28880c;
    public final ChatActivityEnterView d;

    public gg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gg.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar != null) {
            tnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return this.d.R3;
    }

    public final void m(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.tn tnVar = this.d.K2;
        if (tnVar != null && tnVar.w()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new g(this, uri, AndroidUtilities.generatePicturePath(z10, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 3));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar != null && tnVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f26200u2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new com.google.android.gms.common.api.internal.q1(this, arrayList, file, 9), 100L);
                return;
            }
            PhotoViewer.t1().K2(null, tnVar, chatActivityEnterView.R3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new fg(this, photoEntry, file), chatActivityEnterView.K2);
        }
    }

    public final void o(t0.i iVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        int i12;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        ff ffVar = chatActivityEnterView.H0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (ffVar != null) {
            ffVar.h(true);
            chatActivityEnterView.H0 = null;
        }
        org.telegram.ui.jn jnVar = chatActivityEnterView.Q2;
        if (jnVar != null && tnVar != null && jnVar.f39594f) {
            tnVar.Rb();
            return;
        }
        t0.h hVar = iVar.f48084a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.N;
            Uri c3 = hVar.c();
            long j10 = chatActivityEnterView.L2;
            MessageObject messageObject = chatActivityEnterView.O2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.jn jnVar2 = chatActivityEnterView.Q2;
            if (tnVar != null) {
                sendMessageChatArguments = tnVar.C8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c3, null, "image/gif", j10, messageObject, threadMessage2, null, jnVar2, null, z10, 0, iVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.N;
            Uri c6 = hVar.c();
            long j11 = chatActivityEnterView.L2;
            MessageObject messageObject2 = chatActivityEnterView.O2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.jn jnVar3 = chatActivityEnterView.Q2;
            if (tnVar == null) {
                i12 = 0;
            } else {
                i12 = tnVar.N3;
            }
            if (tnVar != null) {
                sendMessageChatArguments = tnVar.C8();
            }
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c6, j11, messageObject2, threadMessage, jnVar3, null, null, null, iVar, 0, null, z10, 0, i12, sendMessageChatArguments);
        }
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.D(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        hg hgVar = this.d.U2;
        if (hgVar != null) {
            hgVar.d2();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        hg hgVar = this.d.U2;
        if (hgVar != null) {
            hgVar.i();
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i10 = ChatActivityEnterView.f26085i5;
            if (chatActivityEnterView.W1 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f26130g5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new u(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new u(this, 18));
        } catch (Throwable th2) {
            FileLog.e(th2);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.O = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.O) {
            chatActivityEnterView.P = getLineCount();
            if (chatActivityEnterView.P > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.p1(z11);
            chatActivityEnterView.v1((chatActivityEnterView.P <= 2 || TextUtils.isEmpty(getText().toString().trim())) ? false : false);
        }
        chatActivityEnterView.O = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        hg hgVar = this.d.U2;
        if (hgVar != null) {
            hgVar.k0();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        hg hgVar = this.d.U2;
        if (hgVar != null) {
            hgVar.E0(i10, i11);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.S1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.W1 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f26228z3 && chatActivityEnterView.f26212w3 == null) {
            if (!chatActivityEnterView.f26203v0 && !chatActivityEnterView.r0()) {
                if (this.f28880c == null) {
                    ad adVar = new ad(this);
                    this.f28880c = adVar;
                    adVar.h = new Runnable(this) {
                        public final gg f28059b;

                        {
                            this.f28059b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            gg ggVar = this.f28059b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ggVar.d;
                                    int i12 = ChatActivityEnterView.f26085i5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ggVar.d;
                                    chatActivityEnterView3.f26128g3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    };
                }
                ad adVar2 = this.f28880c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                adVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f9 = 0;
                rectF.set(f9, f9, measuredWidth, measuredHeight);
                adVar2.f26745i = false;
                adVar2.f26741c = 0;
                adVar2.a(rectF);
                return this.f28880c.b(motionEvent);
            } else if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.Q0.t(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.t1(i10, 0, true, true);
                if (chatActivityEnterView.f26201u3) {
                    chatActivityEnterView.n1(false, true, false, true);
                    chatActivityEnterView.f26128g3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final gg f28059b;

                        {
                            this.f28059b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            gg ggVar = this.f28059b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ggVar.d;
                                    int i12 = ChatActivityEnterView.f26085i5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ggVar.d;
                                    chatActivityEnterView3.f26128g3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.I0();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f26203v0 && !chatActivityEnterView.r0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i10, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = AndroidUtilities.dp(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f9) {
        super.setOffsetY(f9);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.f26132h1.getForeground() != null) {
            hv0 hv0Var = chatActivityEnterView.f26132h1;
            hv0Var.invalidateDrawable(hv0Var.getForeground());
        }
    }
}
