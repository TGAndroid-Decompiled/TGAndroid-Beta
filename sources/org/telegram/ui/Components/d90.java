package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class d90 extends w7.j8 {
    public int f25370a;
    public final TL_iv.PageBlock f25371b;
    public TL_iv.textConcat f25372c = new TL_iv.textConcat();

    public d90(TL_iv.PageBlock pageBlock) {
        this.f25371b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (textconcat.texts.size() == 1) {
            return textconcat.texts.get(0);
        }
        return textconcat;
    }

    @Override
    public final void a(ve.b bVar) {
        int i10 = this.f25370a;
        if (i10 >= 64) {
            return;
        }
        this.f25370a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f25370a--;
        }
    }

    @Override
    public final void b(ve.c cVar) {
        int i10 = this.f25370a;
        if (i10 >= 64) {
            return;
        }
        this.f25370a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f25370a--;
        }
    }

    @Override
    public final void c(ve.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = g90.n(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(ve.e eVar) {
        if (eVar instanceof oe.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof tc.d) {
            w(g90.c(((tc.d) eVar).f48596g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(ve.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(ve.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(ve.n nVar) {
        if (nVar instanceof tc.a) {
            if (!this.f25372c.texts.isEmpty()) {
                w(g90.n("\n"));
            }
            w(g90.c(((tc.a) nVar).f48592g));
            w(g90.n("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(ve.o oVar) {
        int i10 = this.f25370a;
        if (i10 >= 64) {
            return;
        }
        this.f25370a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f25370a--;
        }
    }

    @Override
    public final void m(ve.p pVar) {
        int i10 = this.f25370a;
        if (i10 >= 64) {
            return;
        }
        this.f25370a = i10 + 1;
        try {
            v(pVar);
        } finally {
            this.f25370a--;
        }
    }

    @Override
    public final void n(ve.q qVar) {
        if (!this.f25372c.texts.isEmpty()) {
            w(g90.n("\n\n"));
        }
        v(qVar);
    }

    @Override
    public final void o(ve.r rVar) {
        w(g90.n(rVar.f50811g));
    }

    @Override
    public final void q(ve.d dVar) {
        w(g90.n(dVar.h));
    }

    @Override
    public final void r(ve.g gVar) {
        w(g90.n("\n"));
    }

    @Override
    public final void s(ve.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = trim.substring(7);
            w(textemail);
        } else if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = trim.substring(4);
            w(textphone);
        } else {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = y(kVar);
            texturl.url = trim;
            w(texturl);
        }
    }

    @Override
    public final void t(ve.g gVar) {
        String str;
        if (this.f25371b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(g90.n(str));
    }

    @Override
    public final void u(ve.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f25372c.texts.add(richText);
    }

    public final TL_iv.RichText y(df.c cVar) {
        TL_iv.textConcat textconcat = this.f25372c;
        this.f25372c = new TL_iv.textConcat();
        v(cVar);
        TL_iv.RichText x10 = x(this.f25372c);
        this.f25372c = textconcat;
        return x10;
    }
}
