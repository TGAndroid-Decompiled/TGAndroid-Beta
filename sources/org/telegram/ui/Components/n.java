package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class n implements View.OnClickListener {
    public final int f37417a;
    public final q f37418b;

    public n(q qVar, int i7) {
        this.f37417a = i7;
        this.f37418b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37417a) {
            case 0:
                this.f37418b.dismiss();
                return;
            default:
                q qVar = this.f37418b;
                TL_aicompose.AiComposeTone aiComposeTone = qVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = qVar.d2 + 1;
                    qVar.d2 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.f38454e2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        qVar.d2 = 0;
                    }
                    int i10 = qVar.d2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(qVar.f29679a).sendRequestTyped(gettoneexample, new d3.b(1), new o(qVar, i10, 0));
                    }
                    qVar.f38453c2.O(true);
                    return;
                }
                return;
        }
    }
}
