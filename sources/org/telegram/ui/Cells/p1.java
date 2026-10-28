package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
public final class p1 extends AccessibilityNodeProvider {
    public final Path f24628a = new Path();
    public final RectF f24629b = new RectF();
    public final Rect f24630c = new Rect();
    public final s1 d;

    public p1(s1 s1Var) {
        this.d = s1Var;
    }

    public final ClickableSpan a(int i10, boolean z10) {
        if (i10 == 5000) {
            return null;
        }
        s1 s1Var = this.d;
        if (z10) {
            int i11 = i10 - 3000;
            CharSequence charSequence = s1Var.f25367y7.caption;
            if (!(charSequence instanceof Spannable) || i11 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length <= i11) {
                return null;
            }
            return clickableSpanArr[i11];
        }
        int i12 = i10 - 2000;
        CharSequence charSequence2 = s1Var.f25367y7.messageText;
        if (!(charSequence2 instanceof Spannable) || i12 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length <= i12) {
            return null;
        }
        return clickableSpanArr2[i12];
    }

    public final RichMessageLayout.RichBlock b(int i10, int[] iArr) {
        RichMessageLayout richMessageLayout;
        int i11;
        MessageObject messageObject = this.d.f25367y7;
        if (messageObject != null && (richMessageLayout = messageObject.richLayout) != null && i10 - 6000 >= 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < richMessageLayout.blocks.size(); i13++) {
                RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i13);
                if (richBlock.isVisible()) {
                    int accessibilityElementCount = richBlock.getAccessibilityElementCount() + i12;
                    if (i11 < accessibilityElementCount) {
                        iArr[0] = i11 - i12;
                        return richBlock;
                    }
                    i12 = accessibilityElementCount;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p1.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        j1 j1Var;
        h1 h1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        s1 s1Var = this.d;
        ArrayList arrayList = s1Var.Y5;
        ArrayList arrayList2 = s1Var.f25222o7;
        if (i10 == -1) {
            s1Var.performAccessibilityAction(i11, bundle);
            return true;
        } else if (i11 == 64) {
            s1Var.K3(i10, 32768, null);
            return true;
        } else {
            boolean z10 = false;
            if (i11 == 16) {
                if (i10 == 5000) {
                    j1 j1Var2 = s1Var.Jc;
                    if (j1Var2 != null) {
                        j1Var2.m0(s1Var, s1Var.Yb, 0.0f, 0.0f);
                        return true;
                    }
                } else if (i10 >= 6000) {
                    int[] iArr = {0};
                    RichMessageLayout.RichBlock b10 = b(i10, iArr);
                    if (b10 != null && b10.onAccessibilityElementClick(iArr[0], s1Var)) {
                        s1Var.K3(i10, 1, null);
                        AndroidUtilities.makeAccessibilityAnnouncement(b10.getAccessibilityElementStateDescription(iArr[0]));
                        return true;
                    }
                } else if (i10 >= 3000) {
                    ClickableSpan a2 = a(i10, true);
                    if (a2 != null) {
                        s1Var.Jc.I0(s1Var, a2, false);
                        s1Var.K3(i10, 1, null);
                        return true;
                    }
                } else if (i10 >= 2000) {
                    ClickableSpan a10 = a(i10, false);
                    if (a10 != null) {
                        s1Var.Jc.I0(s1Var, a10, false);
                        s1Var.K3(i10, 1, null);
                        return true;
                    }
                } else {
                    if (i10 >= 1000) {
                        int i12 = i10 - 1000;
                        if (i12 < arrayList2.size()) {
                            d0 d0Var = (d0) arrayList2.get(i12);
                            j1 j1Var3 = s1Var.Jc;
                            if (j1Var3 != null && !d0Var.f23972m) {
                                BotInlineKeyboard.ButtonCustom buttonCustom = d0Var.f23969j;
                                if (buttonCustom != null) {
                                    j1Var3.C(s1Var, buttonCustom);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = d0Var.f23968i;
                                    if (keyboardInlineButton != null) {
                                        j1Var3.W0(s1Var, keyboardInlineButton);
                                    }
                                }
                            }
                            s1Var.K3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 >= 500) {
                        int i13 = i10 - 500;
                        if (i13 < arrayList.size()) {
                            q1 q1Var = (q1) arrayList.get(i13);
                            if (s1Var.Jc != null) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(q1Var.f24807s);
                                s1Var.Jc.i(s1Var, arrayList3, -1, 0, 0);
                            }
                            s1Var.K3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 == 495) {
                        s1Var.x1();
                        return true;
                    } else if (i10 == 499) {
                        j1 j1Var4 = s1Var.Jc;
                        if (j1Var4 != null) {
                            j1Var4.E0(s1Var.f25032b3, s1Var);
                            return true;
                        }
                    } else if (i10 == 492) {
                        j1 j1Var5 = s1Var.Jc;
                        if (j1Var5 != null) {
                            j1Var5.E0(5, s1Var);
                            return true;
                        }
                    } else if (i10 == 491) {
                        j1 j1Var6 = s1Var.Jc;
                        if (j1Var6 != null) {
                            j1Var6.E0(5, s1Var);
                            return true;
                        }
                    } else if (i10 == 490) {
                        j1 j1Var7 = s1Var.Jc;
                        if (j1Var7 != null) {
                            j1Var7.E0(31, s1Var);
                            return true;
                        }
                    } else if (i10 == 489) {
                        j1 j1Var8 = s1Var.Jc;
                        if (j1Var8 != null) {
                            j1Var8.E0(30, s1Var);
                            return true;
                        }
                    } else if (i10 == 498) {
                        j1 j1Var9 = s1Var.Jc;
                        if (j1Var9 != null) {
                            j1Var9.p(s1Var);
                            return true;
                        }
                    } else if (i10 == 497) {
                        if (s1Var.Jc != null && ((!s1Var.W7 || s1Var.U7 || s1Var.f25367y7.getReplyTopMsgId() != 0) && (s1Var.f25367y7.hasValidReplyMessageObject() || s1Var.f25369y9 || ((message = s1Var.f25367y7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)))) {
                            s1Var.Jc.H1(s1Var, s1Var.f25367y7.getReplyMsgId(), 0.0f, 0.0f, false);
                            return true;
                        }
                    } else if (i10 == 494) {
                        j1 j1Var10 = s1Var.Jc;
                        if (j1Var10 != null) {
                            TLRPC.Chat chat = s1Var.f25154jc;
                            if (chat != null) {
                                j1Var10.P(s1Var, chat, s1Var.f25367y7.messageOwner.fwd_from.channel_post, s1Var.f25103g1, s1Var.f25116h1, false);
                                return true;
                            }
                            TLRPC.User user = s1Var.f25127hc;
                            if (user != null) {
                                j1Var10.m0(s1Var, user, s1Var.f25103g1, s1Var.f25116h1);
                                return true;
                            } else if (s1Var.f25169kc != null) {
                                j1Var10.m(s1Var);
                                return true;
                            }
                        }
                    } else if (i10 == 496) {
                        j1 j1Var11 = s1Var.Jc;
                        if (j1Var11 != null) {
                            if (s1Var.f25052c8) {
                                j1Var11.p(s1Var);
                                return true;
                            }
                            j1Var11.s(s1Var);
                            return true;
                        }
                    } else if (i10 == 493 && (h1Var = s1Var.M5) != null) {
                        h1Var.m();
                        return true;
                    }
                    return false;
                }
            } else if (i11 == 32) {
                if (i10 >= 3000) {
                    z10 = true;
                }
                ClickableSpan a11 = a(i10, z10);
                if (a11 != null && (j1Var = s1Var.Jc) != null) {
                    j1Var.I0(s1Var, a11, true);
                    s1Var.K3(i10, 2, null);
                }
            }
            return true;
        }
    }
}
