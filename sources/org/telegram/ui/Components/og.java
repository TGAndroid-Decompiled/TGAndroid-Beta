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
public abstract class og extends eu {
    public gd f29351c;
    public final ChatActivityEnterView d;

    public og(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.og.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar != null) {
            ynVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        return this.d.W3;
    }

    public final void m(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.yn ynVar = this.d.P2;
        if (ynVar != null && ynVar.v()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.o(this, uri, AndroidUtilities.generatePicturePath(z10, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 12));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar != null && ynVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f23997z2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new c5.v(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.t1().K2(null, ynVar, chatActivityEnterView.W3);
            PhotoViewer.t1().g2(arrayList, 0, 2, false, new ng(this, photoEntry, file), chatActivityEnterView.P2);
        }
    }

    public final void o(t0.i iVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        int i12;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        of ofVar = chatActivityEnterView.L0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (ofVar != null) {
            ofVar.h(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.on onVar = chatActivityEnterView.V2;
        if (onVar != null && ynVar != null && onVar.f39245f) {
            ynVar.Qb();
            return;
        }
        t0.h hVar = iVar.f46888a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.R;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.on onVar2 = chatActivityEnterView.V2;
            if (ynVar != null) {
                sendMessageChatArguments = ynVar.D8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j3, messageObject, threadMessage2, null, onVar2, null, z10, 0, iVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.R;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.Q2;
            MessageObject messageObject2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.on onVar3 = chatActivityEnterView.V2;
            if (ynVar == null) {
                i12 = 0;
            } else {
                i12 = ynVar.P3;
            }
            if (ynVar != null) {
                sendMessageChatArguments = ynVar.D8();
            }
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j10, messageObject2, threadMessage, onVar3, null, null, null, iVar, 0, null, z10, 0, i12, sendMessageChatArguments);
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.H(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.d2();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.i();
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
            int i10 = ChatActivityEnterView.f23851n5;
            if (chatActivityEnterView.f23861b2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f23924l5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
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
            chatActivityEnterView.o1(z11);
            chatActivityEnterView.u1((chatActivityEnterView.T <= 2 || TextUtils.isEmpty(getText().toString().trim())) ? false : false);
        }
        chatActivityEnterView.S = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.m0();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        pg pgVar = this.d.Z2;
        if (pgVar != null) {
            pgVar.E0(i10, i11);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.f23861b2 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.E3 && chatActivityEnterView.B3 == null) {
            if (!chatActivityEnterView.f23995z0 && !chatActivityEnterView.r0()) {
                if (this.f29351c == null) {
                    gd gdVar = new gd(this);
                    this.f29351c = gdVar;
                    gdVar.h = new Runnable(this) {
                        public final og f28622b;

                        {
                            this.f28622b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            og ogVar = this.f28622b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ogVar.d;
                                    int i12 = ChatActivityEnterView.f23851n5;
                                    chatActivityEnterView2.t1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ogVar.d;
                                    chatActivityEnterView3.f23923l3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    };
                }
                gd gdVar2 = this.f29351c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                gdVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                gdVar2.f26811i = false;
                gdVar2.f26807c = 0;
                gdVar2.a(rectF);
                return this.f29351c.b(motionEvent);
            } else if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.s1(i10, 0, true, true);
                if (chatActivityEnterView.f23998z3) {
                    chatActivityEnterView.m1(false, true, false, true);
                    chatActivityEnterView.f23923l3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final og f28622b;

                        {
                            this.f28622b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            og ogVar = this.f28622b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ogVar.d;
                                    int i12 = ChatActivityEnterView.f23851n5;
                                    chatActivityEnterView2.t1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ogVar.d;
                                    chatActivityEnterView3.f23923l3 = false;
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
        if (!chatActivityEnterView.f23995z0 && !chatActivityEnterView.r0()) {
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
        if (chatActivityEnterView.f23925m1.getForeground() != null) {
            lw0 lw0Var = chatActivityEnterView.f23925m1;
            lw0Var.invalidateDrawable(lw0Var.getForeground());
        }
    }
}
