package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

public final class eb extends nb {

    public final qg.k f37724t0;

    public final qb f37725u0;

    public eb(qb qbVar, Context context) {
        super(qbVar, context);
        this.f37725u0 = qbVar;
        this.f37724t0 = new qg.k();
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.nb0) {
            ((org.telegram.ui.Components.nb0) drawable).p();
        }
        qg.k kVar = this.f37724t0;
        og.a aVarC = kVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(kVar.a(aVarC));
        qb qbVar = this.f37725u0;
        qbVar.f41590a.f19458a = aVarC;
        sg.f fVar = qbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.l lVar = com.google.firebase.messaging.l.f4598e;
        if (lVar == null || !lVar.f4599a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        s4 s4Var = (s4) com.google.firebase.messaging.l.i().d;
        if (s4Var == null) {
            return true;
        }
        s4Var.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isRoundVideo() || playingMessageObject.eventId == 0) {
            return;
        }
        long dialogId = playingMessageObject.getDialogId();
        qb qbVar = this.f37725u0;
        if (dialogId == (-qbVar.f41614s.f22380id)) {
            MediaController.getInstance().setTextureView(qbVar.Q0(false), qbVar.f41598e0, qbVar.f41596d0, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int paddingTop;
        int measuredHeight;
        int childCount = getChildCount();
        int i19 = 0;
        while (true) {
            qb qbVar = this.f37725u0;
            if (i19 >= childCount) {
                qbVar.d1();
                S();
                return;
            }
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 112;
                int i22 = i20 & 7;
                if (i22 != 1) {
                    if (i22 != 5) {
                        i16 = layoutParams.leftMargin;
                    } else {
                        i14 = i12 - measuredWidth;
                        i15 = layoutParams.rightMargin;
                    }
                    if (i21 != 16) {
                        if (i21 != 48) {
                            paddingTop = layoutParams.topMargin + getPaddingTop();
                            if (childAt != ((org.telegram.ui.ActionBar.n2) qbVar).actionBar && ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getVisibility() == 0) {
                                paddingTop += ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getMeasuredHeight();
                            }
                        } else if (i21 != 80) {
                            paddingTop = layoutParams.topMargin;
                        } else {
                            i17 = (i13 - i11) - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt == qbVar.H) {
                            int iDp = AndroidUtilities.dp(24.0f);
                            if (((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getVisibility() == 0) {
                                measuredHeight = ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getMeasuredHeight() / 2;
                            } else {
                                measuredHeight = 0;
                            }
                            paddingTop -= iDp - measuredHeight;
                        } else if (childAt == ((org.telegram.ui.ActionBar.n2) qbVar).actionBar) {
                            paddingTop -= getPaddingTop();
                        } else if (childAt != this.H || childAt == qbVar.W) {
                            paddingTop = 0;
                        } else if (childAt == qbVar.A) {
                            paddingTop = -qbVar.f41612r;
                        }
                        childAt.layout(i16, paddingTop, measuredWidth + i16, measuredHeight2 + paddingTop);
                    } else {
                        i17 = (((i13 - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    paddingTop = i17 - i18;
                    if (childAt == qbVar.H) {
                        int iDp2 = AndroidUtilities.dp(24.0f);
                        if (((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getVisibility() == 0) {
                            measuredHeight = ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getMeasuredHeight() / 2;
                        } else {
                            measuredHeight = 0;
                        }
                        paddingTop -= iDp2 - measuredHeight;
                    } else if (childAt == ((org.telegram.ui.ActionBar.n2) qbVar).actionBar) {
                        paddingTop -= getPaddingTop();
                    } else if (childAt != this.H) {
                        paddingTop = 0;
                    } else {
                        paddingTop = 0;
                    }
                    childAt.layout(i16, paddingTop, measuredWidth + i16, measuredHeight2 + paddingTop);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i21 != 16) {
                    if (i21 != 48) {
                        paddingTop = layoutParams.topMargin + getPaddingTop();
                        if (childAt != ((org.telegram.ui.ActionBar.n2) qbVar).actionBar) {
                            paddingTop += ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getMeasuredHeight();
                        }
                    } else if (i21 != 80) {
                        paddingTop = layoutParams.topMargin;
                    } else {
                        i17 = (i13 - i11) - measuredHeight2;
                        i18 = layoutParams.bottomMargin;
                    }
                    if (childAt == qbVar.H) {
                        int iDp3 = AndroidUtilities.dp(24.0f);
                        if (((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getVisibility() == 0) {
                            measuredHeight = ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getMeasuredHeight() / 2;
                        } else {
                            measuredHeight = 0;
                        }
                        paddingTop -= iDp3 - measuredHeight;
                    } else if (childAt == ((org.telegram.ui.ActionBar.n2) qbVar).actionBar) {
                        paddingTop -= getPaddingTop();
                    } else if (childAt != this.H) {
                        paddingTop = 0;
                    } else {
                        paddingTop = 0;
                    }
                    childAt.layout(i16, paddingTop, measuredWidth + i16, measuredHeight2 + paddingTop);
                } else {
                    i17 = (((i13 - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                    i18 = layoutParams.bottomMargin;
                }
                paddingTop = i17 - i18;
                if (childAt == qbVar.H) {
                    int iDp4 = AndroidUtilities.dp(24.0f);
                    if (((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getVisibility() == 0) {
                        measuredHeight = ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getMeasuredHeight() / 2;
                    } else {
                        measuredHeight = 0;
                    }
                    paddingTop -= iDp4 - measuredHeight;
                } else if (childAt == ((org.telegram.ui.ActionBar.n2) qbVar).actionBar) {
                    paddingTop -= getPaddingTop();
                } else if (childAt != this.H) {
                    paddingTop = 0;
                } else {
                    paddingTop = 0;
                }
                childAt.layout(i16, paddingTop, measuredWidth + i16, measuredHeight2 + paddingTop);
            }
            i19++;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qb qbVar = this.f37725u0;
        qbVar.P0.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        og.a aVar = qbVar.f41590a.f19458a;
        if (aVar instanceof og.b) {
            ((og.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        measureChildWithMargins(((org.telegram.ui.ActionBar.n2) qbVar).actionBar, i10, 0, i11, 0);
        int measuredHeight = ((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getMeasuredHeight();
        if (((org.telegram.ui.ActionBar.n2) qbVar).actionBar.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8 && childAt != ((org.telegram.ui.ActionBar.n2) qbVar).actionBar) {
                if (childAt == qbVar.A || childAt == qbVar.f41619w) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (qbVar.f41612r * 2), 1073741824));
                } else if (childAt == qbVar.H) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                } else {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }
}
