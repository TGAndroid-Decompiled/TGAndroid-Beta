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
public abstract class ng extends zt {
    public gd f28742c;
    public final ChatActivityEnterView d;

    public ng(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ng.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        if (coVar != null) {
            coVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.d.V3;
    }

    public final void m(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.co coVar = this.d.O2;
        if (coVar != null && coVar.v()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.ActionBar.p(this, uri, AndroidUtilities.generatePicturePath(z10, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 9));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        if (coVar != null && coVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f23802y2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new c5.v(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.t1().K2(null, coVar, chatActivityEnterView.V3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new mg(this, photoEntry, file), chatActivityEnterView.O2);
        }
    }

    public final void o(t0.j jVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        int i12;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        nf nfVar = chatActivityEnterView.L0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (nfVar != null) {
            nfVar.h(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.sn snVar = chatActivityEnterView.U2;
        if (snVar != null && coVar != null && snVar.f40481f) {
            coVar.Rb();
            return;
        }
        t0.i iVar = jVar.f46422a;
        if (iVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.R;
            Uri c10 = iVar.c();
            long j3 = chatActivityEnterView.P2;
            MessageObject messageObject = chatActivityEnterView.S2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.sn snVar2 = chatActivityEnterView.U2;
            if (coVar != null) {
                sendMessageChatArguments = coVar.C8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j3, messageObject, threadMessage2, null, snVar2, null, z10, 0, jVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.R;
            Uri c11 = iVar.c();
            long j10 = chatActivityEnterView.P2;
            MessageObject messageObject2 = chatActivityEnterView.S2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.sn snVar3 = chatActivityEnterView.U2;
            if (coVar == null) {
                i12 = 0;
            } else {
                i12 = coVar.R3;
            }
            if (coVar != null) {
                sendMessageChatArguments = coVar.C8();
            }
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j10, messageObject2, threadMessage, snVar3, null, null, null, jVar, 0, null, z10, 0, i12, sendMessageChatArguments);
        }
        og ogVar = chatActivityEnterView.Y2;
        if (ogVar != null) {
            ogVar.G(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        og ogVar = this.d.Y2;
        if (ogVar != null) {
            ogVar.V1();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        og ogVar = this.d.Y2;
        if (ogVar != null) {
            ogVar.k();
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
            int i10 = ChatActivityEnterView.f23661m5;
            if (chatActivityEnterView.a2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f23730k5) {
                t0.c.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.g.a(onCreateInputConnection, editorInfo, new t(this, 18));
            }
            t0.c.b(editorInfo, null);
            return t0.g.a(onCreateInputConnection, editorInfo, new t(this, 18));
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
        chatActivityEnterView.S = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            if (chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.p1(z11);
            chatActivityEnterView.v1((chatActivityEnterView.T <= 2 || TextUtils.isEmpty(getText().toString().trim())) ? false : false);
        }
        chatActivityEnterView.S = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        og ogVar = this.d.Y2;
        if (ogVar != null) {
            ogVar.l0();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        og ogVar = this.d.Y2;
        if (ogVar != null) {
            ogVar.B0(i10, i11);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.W1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.a2 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.D3 && chatActivityEnterView.A3 == null) {
            if (!chatActivityEnterView.f23804z0 && !chatActivityEnterView.r0()) {
                if (this.f28742c == null) {
                    gd gdVar = new gd(this);
                    this.f28742c = gdVar;
                    gdVar.h = new Runnable(this) {
                        public final ng f28170b;

                        {
                            this.f28170b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            ng ngVar = this.f28170b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ngVar.d;
                                    int i12 = ChatActivityEnterView.f23661m5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ngVar.d;
                                    chatActivityEnterView3.f23728k3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    };
                }
                gd gdVar2 = this.f28742c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                gdVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                gdVar2.f26353i = false;
                gdVar2.f26349c = 0;
                gdVar2.a(rectF);
                return this.f28742c.b(motionEvent);
            } else if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.t1(i10, 0, true, true);
                if (chatActivityEnterView.y3) {
                    chatActivityEnterView.n1(false, true, false, true);
                    chatActivityEnterView.f23728k3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final ng f28170b;

                        {
                            this.f28170b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            ng ngVar = this.f28170b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ngVar.d;
                                    int i12 = ChatActivityEnterView.f23661m5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ngVar.d;
                                    chatActivityEnterView3.f23728k3 = false;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f23804z0 && !chatActivityEnterView.r0()) {
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
    public void setOffsetY(float f7) {
        super.setOffsetY(f7);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.l1.getForeground() != null) {
            ov0 ov0Var = chatActivityEnterView.l1;
            ov0Var.invalidateDrawable(ov0Var.getForeground());
        }
    }
}
